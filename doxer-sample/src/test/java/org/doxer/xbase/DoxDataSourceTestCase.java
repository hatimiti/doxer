package org.doxer.xbase;

import static org.dbunit.operation.DatabaseOperation.*;

import java.io.FileNotFoundException;
import java.lang.reflect.Method;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.dbunit.DataSourceBasedDBTestCase;
import org.dbunit.IDatabaseTester;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.excel.XlsDataSet;
import org.dbunit.ext.mssql.InsertIdentityOperation;
import org.dbunit.operation.DatabaseOperation;
import org.doxer.app.Application;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.github.hatimiti.doxer.common.util._Obj;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration("WebContent")
//@ContextConfiguration(locations = {"classpath:/spring/*.xml"})
@SpringBootTest( classes = { Application.class })
public abstract class DoxDataSourceTestCase extends DataSourceBasedDBTestCase {

	protected static final Logger logger = _Obj.getLogger();

	@Resource
	protected DataSource dataSource;

	@Rule
	public TestName testName = new TestName();

	@Before
	public void setup() throws Exception {
		try {
			IDatabaseConnection conn = new DatabaseConnection(dataSource.getConnection());
//			super.setUp();
//			setUp4TestMethod();
			new InsertIdentityOperation(CLEAN_INSERT).execute(conn, getDataSet());
			new InsertIdentityOperation(INSERT).execute(conn, getDataSet4TestMethod());

		} catch (FileNotFoundException e) {
			logger.info("XlsDataSet is not found.");
		}
	}

	@After
	public void tearDown() throws Exception {
		try {
			IDatabaseConnection conn = new DatabaseConnection(dataSource.getConnection());
//			tearDown4TestMethod();
//			super.tearDown();
			new InsertIdentityOperation(DatabaseOperation.DELETE).execute(conn, getDataSet());
			new InsertIdentityOperation(DatabaseOperation.DELETE).execute(conn, getDataSet4TestMethod());

		} catch (FileNotFoundException e) {
		}
	}

	@Override
	protected DataSource getDataSource() {
		return dataSource;
	}

	protected void setUp4TestMethod() throws Exception {
		logger.debug("setUp4TestMethod() - start");
		final IDatabaseTester databaseTester = getDatabaseTester();
		assertNotNull("DatabaseTester is not set", databaseTester);
		databaseTester.setSetUpOperation(getSetUpOperation());
		databaseTester.setDataSet(getDataSet4TestMethod());
		databaseTester.setOperationListener(getOperationListener());
		databaseTester.onSetup();
	}

	protected void tearDown4TestMethod() throws Exception {
		logger.debug("tearDown4TestMethod() - start");
		final IDatabaseTester databaseTester = getDatabaseTester();
		assertNotNull("DatabaseTester is not set", databaseTester);
		databaseTester.setTearDownOperation(getTearDownOperation());
		databaseTester.setDataSet(getDataSet4TestMethod());
		databaseTester.setOperationListener(getOperationListener());
		databaseTester.onTearDown();
	}

	@Override
	protected IDataSet getDataSet() throws Exception {
		return getXlsDataSet("init.xlsx");
	}

	protected XlsDataSet getDataSet4TestMethod() throws Exception {
		return getXlsDataSet(getXlsDataSetFileName());
	}

	private String getXlsDataSetFileName() {

		String fileName = testName.getMethodName() + ".xlsx";

		try {
			Method m = this.getClass().getMethod(testName.getMethodName());
			DataSetDefinition d = m.getAnnotation(DataSetDefinition.class);
			if (d != null) {
				fileName = d.value();
			}
		} catch (Exception e) {
		}

		return fileName;
	}

	protected XlsDataSet getXlsDataSet(String xlsName) throws Exception {
		return new XlsDataSet(new ClassPathResource(getDataSetDirName() + "/" + xlsName).getFile());
	}

	protected String getDataSetDirName() {
		return "/dataset/" + this.getClass().getName().replaceAll("\\.", "/");
	}

}
