package org.doxer.app.db.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import org.doxer.app.db.dbflute.allcommon.*;
import org.doxer.app.db.dbflute.cbean.*;
import org.doxer.app.db.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of CM_SHAIN.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsCmShainCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsCmShainCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "CM_SHAIN";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_SHAIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmShainId The value of cmShainId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCmShainId_Equal(Long cmShainId) {
        doSetCmShainId_Equal(cmShainId);
    }

    protected void doSetCmShainId_Equal(Long cmShainId) {
        regCmShainId(CK_EQ, cmShainId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_SHAIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmShainId The value of cmShainId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCmShainId_NotEqual(Long cmShainId) {
        doSetCmShainId_NotEqual(cmShainId);
    }

    protected void doSetCmShainId_NotEqual(Long cmShainId) {
        regCmShainId(CK_NES, cmShainId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_SHAIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmShainId The value of cmShainId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCmShainId_GreaterThan(Long cmShainId) {
        regCmShainId(CK_GT, cmShainId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_SHAIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmShainId The value of cmShainId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCmShainId_LessThan(Long cmShainId) {
        regCmShainId(CK_LT, cmShainId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_SHAIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmShainId The value of cmShainId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCmShainId_GreaterEqual(Long cmShainId) {
        regCmShainId(CK_GE, cmShainId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_SHAIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmShainId The value of cmShainId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCmShainId_LessEqual(Long cmShainId) {
        regCmShainId(CK_LE, cmShainId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CM_SHAIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of cmShainId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cmShainId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCmShainId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCmShainId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CM_SHAIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of cmShainId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cmShainId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCmShainId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCmShainId(), "CM_SHAIN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CM_SHAIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmShainIdList The collection of cmShainId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmShainId_InScope(Collection<Long> cmShainIdList) {
        doSetCmShainId_InScope(cmShainIdList);
    }

    protected void doSetCmShainId_InScope(Collection<Long> cmShainIdList) {
        regINS(CK_INS, cTL(cmShainIdList), xgetCValueCmShainId(), "CM_SHAIN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CM_SHAIN_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param cmShainIdList The collection of cmShainId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmShainId_NotInScope(Collection<Long> cmShainIdList) {
        doSetCmShainId_NotInScope(cmShainIdList);
    }

    protected void doSetCmShainId_NotInScope(Collection<Long> cmShainIdList) {
        regINS(CK_NINS, cTL(cmShainIdList), xgetCValueCmShainId(), "CM_SHAIN_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select konyu_cm_shain_id from ST_SHOHIN_KONYU where ...)} <br>
     * ST_SHOHIN_KONYU by KONYU_CM_SHAIN_ID, named 'stShohinKonyuAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsStShohinKonyu</span>(konyuCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     konyuCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of StShohinKonyuList for 'exists'. (NotNull)
     */
    public void existsStShohinKonyu(SubQuery<StShohinKonyuCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        StShohinKonyuCB cb = new StShohinKonyuCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCmShainId_ExistsReferrer_StShohinKonyuList(cb.query());
        registerExistsReferrer(cb.query(), "CM_SHAIN_ID", "konyu_cm_shain_id", pp, "stShohinKonyuList");
    }
    public abstract String keepCmShainId_ExistsReferrer_StShohinKonyuList(StShohinKonyuCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select konyu_cm_shain_id from ST_SHOHIN_KONYU where ...)} <br>
     * ST_SHOHIN_KONYU by KONYU_CM_SHAIN_ID, named 'stShohinKonyuAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsStShohinKonyu</span>(konyuCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     konyuCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CmShainId_NotExistsReferrer_StShohinKonyuList for 'not exists'. (NotNull)
     */
    public void notExistsStShohinKonyu(SubQuery<StShohinKonyuCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        StShohinKonyuCB cb = new StShohinKonyuCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCmShainId_NotExistsReferrer_StShohinKonyuList(cb.query());
        registerNotExistsReferrer(cb.query(), "CM_SHAIN_ID", "konyu_cm_shain_id", pp, "stShohinKonyuList");
    }
    public abstract String keepCmShainId_NotExistsReferrer_StShohinKonyuList(StShohinKonyuCQ sq);

    public void xsderiveStShohinKonyuList(String fn, SubQuery<StShohinKonyuCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        StShohinKonyuCB cb = new StShohinKonyuCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCmShainId_SpecifyDerivedReferrer_StShohinKonyuList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CM_SHAIN_ID", "konyu_cm_shain_id", pp, "stShohinKonyuList", al, op);
    }
    public abstract String keepCmShainId_SpecifyDerivedReferrer_StShohinKonyuList(StShohinKonyuCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from ST_SHOHIN_KONYU where ...)} <br>
     * ST_SHOHIN_KONYU by KONYU_CM_SHAIN_ID, named 'stShohinKonyuAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedStShohinKonyu()</span>.<span style="color: #CC4747">max</span>(konyuCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     konyuCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     konyuCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<StShohinKonyuCB> derivedStShohinKonyu() {
        return xcreateQDRFunctionStShohinKonyuList();
    }
    protected HpQDRFunction<StShohinKonyuCB> xcreateQDRFunctionStShohinKonyuList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveStShohinKonyuList(fn, sq, rd, vl, op));
    }
    public void xqderiveStShohinKonyuList(String fn, SubQuery<StShohinKonyuCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        StShohinKonyuCB cb = new StShohinKonyuCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCmShainId_QueryDerivedReferrer_StShohinKonyuList(cb.query()); String prpp = keepCmShainId_QueryDerivedReferrer_StShohinKonyuListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CM_SHAIN_ID", "konyu_cm_shain_id", sqpp, "stShohinKonyuList", rd, vl, prpp, op);
    }
    public abstract String keepCmShainId_QueryDerivedReferrer_StShohinKonyuList(StShohinKonyuCQ sq);
    public abstract String keepCmShainId_QueryDerivedReferrer_StShohinKonyuListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CM_SHAIN_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setCmShainId_IsNull() { regCmShainId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CM_SHAIN_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setCmShainId_IsNotNull() { regCmShainId(CK_ISNN, DOBJ); }

    protected void regCmShainId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCmShainId(), "CM_SHAIN_ID"); }
    protected abstract ConditionValue xgetCValueCmShainId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {NotNull, BIGINT(19), FK to cm_kaisha}
     * @param cmKaishaId The value of cmKaishaId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCmKaishaId_Equal(Long cmKaishaId) {
        doSetCmKaishaId_Equal(cmKaishaId);
    }

    protected void doSetCmKaishaId_Equal(Long cmKaishaId) {
        regCmKaishaId(CK_EQ, cmKaishaId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {NotNull, BIGINT(19), FK to cm_kaisha}
     * @param cmKaishaId The value of cmKaishaId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCmKaishaId_NotEqual(Long cmKaishaId) {
        doSetCmKaishaId_NotEqual(cmKaishaId);
    }

    protected void doSetCmKaishaId_NotEqual(Long cmKaishaId) {
        regCmKaishaId(CK_NES, cmKaishaId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {NotNull, BIGINT(19), FK to cm_kaisha}
     * @param cmKaishaId The value of cmKaishaId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCmKaishaId_GreaterThan(Long cmKaishaId) {
        regCmKaishaId(CK_GT, cmKaishaId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {NotNull, BIGINT(19), FK to cm_kaisha}
     * @param cmKaishaId The value of cmKaishaId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCmKaishaId_LessThan(Long cmKaishaId) {
        regCmKaishaId(CK_LT, cmKaishaId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {NotNull, BIGINT(19), FK to cm_kaisha}
     * @param cmKaishaId The value of cmKaishaId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCmKaishaId_GreaterEqual(Long cmKaishaId) {
        regCmKaishaId(CK_GE, cmKaishaId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {NotNull, BIGINT(19), FK to cm_kaisha}
     * @param cmKaishaId The value of cmKaishaId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCmKaishaId_LessEqual(Long cmKaishaId) {
        regCmKaishaId(CK_LE, cmKaishaId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {NotNull, BIGINT(19), FK to cm_kaisha}
     * @param minNumber The min number of cmKaishaId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cmKaishaId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setCmKaishaId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setCmKaishaId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CM_KAISHA_ID: {NotNull, BIGINT(19), FK to cm_kaisha}
     * @param minNumber The min number of cmKaishaId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cmKaishaId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setCmKaishaId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCmKaishaId(), "CM_KAISHA_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CM_KAISHA_ID: {NotNull, BIGINT(19), FK to cm_kaisha}
     * @param cmKaishaIdList The collection of cmKaishaId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmKaishaId_InScope(Collection<Long> cmKaishaIdList) {
        doSetCmKaishaId_InScope(cmKaishaIdList);
    }

    protected void doSetCmKaishaId_InScope(Collection<Long> cmKaishaIdList) {
        regINS(CK_INS, cTL(cmKaishaIdList), xgetCValueCmKaishaId(), "CM_KAISHA_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CM_KAISHA_ID: {NotNull, BIGINT(19), FK to cm_kaisha}
     * @param cmKaishaIdList The collection of cmKaishaId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmKaishaId_NotInScope(Collection<Long> cmKaishaIdList) {
        doSetCmKaishaId_NotInScope(cmKaishaIdList);
    }

    protected void doSetCmKaishaId_NotInScope(Collection<Long> cmKaishaIdList) {
        regINS(CK_NINS, cTL(cmKaishaIdList), xgetCValueCmKaishaId(), "CM_KAISHA_ID");
    }

    protected void regCmKaishaId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCmKaishaId(), "CM_KAISHA_ID"); }
    protected abstract ConditionValue xgetCValueCmKaishaId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAIN_SEI: {NotNull, VARCHAR(50)}
     * @param shainSei The value of shainSei as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainSei_Equal(String shainSei) {
        doSetShainSei_Equal(fRES(shainSei));
    }

    protected void doSetShainSei_Equal(String shainSei) {
        regShainSei(CK_EQ, shainSei);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAIN_SEI: {NotNull, VARCHAR(50)}
     * @param shainSei The value of shainSei as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainSei_NotEqual(String shainSei) {
        doSetShainSei_NotEqual(fRES(shainSei));
    }

    protected void doSetShainSei_NotEqual(String shainSei) {
        regShainSei(CK_NES, shainSei);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAIN_SEI: {NotNull, VARCHAR(50)}
     * @param shainSei The value of shainSei as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainSei_GreaterThan(String shainSei) {
        regShainSei(CK_GT, fRES(shainSei));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAIN_SEI: {NotNull, VARCHAR(50)}
     * @param shainSei The value of shainSei as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainSei_LessThan(String shainSei) {
        regShainSei(CK_LT, fRES(shainSei));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAIN_SEI: {NotNull, VARCHAR(50)}
     * @param shainSei The value of shainSei as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainSei_GreaterEqual(String shainSei) {
        regShainSei(CK_GE, fRES(shainSei));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAIN_SEI: {NotNull, VARCHAR(50)}
     * @param shainSei The value of shainSei as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainSei_LessEqual(String shainSei) {
        regShainSei(CK_LE, fRES(shainSei));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHAIN_SEI: {NotNull, VARCHAR(50)}
     * @param shainSeiList The collection of shainSei as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainSei_InScope(Collection<String> shainSeiList) {
        doSetShainSei_InScope(shainSeiList);
    }

    protected void doSetShainSei_InScope(Collection<String> shainSeiList) {
        regINS(CK_INS, cTL(shainSeiList), xgetCValueShainSei(), "SHAIN_SEI");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHAIN_SEI: {NotNull, VARCHAR(50)}
     * @param shainSeiList The collection of shainSei as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainSei_NotInScope(Collection<String> shainSeiList) {
        doSetShainSei_NotInScope(shainSeiList);
    }

    protected void doSetShainSei_NotInScope(Collection<String> shainSeiList) {
        regINS(CK_NINS, cTL(shainSeiList), xgetCValueShainSei(), "SHAIN_SEI");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAIN_SEI: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setShainSei_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param shainSei The value of shainSei as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setShainSei_LikeSearch(String shainSei, ConditionOptionCall<LikeSearchOption> opLambda) {
        setShainSei_LikeSearch(shainSei, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAIN_SEI: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setShainSei_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shainSei The value of shainSei as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setShainSei_LikeSearch(String shainSei, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shainSei), xgetCValueShainSei(), "SHAIN_SEI", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAIN_SEI: {NotNull, VARCHAR(50)}
     * @param shainSei The value of shainSei as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setShainSei_NotLikeSearch(String shainSei, ConditionOptionCall<LikeSearchOption> opLambda) {
        setShainSei_NotLikeSearch(shainSei, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAIN_SEI: {NotNull, VARCHAR(50)}
     * @param shainSei The value of shainSei as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setShainSei_NotLikeSearch(String shainSei, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shainSei), xgetCValueShainSei(), "SHAIN_SEI", likeSearchOption);
    }

    protected void regShainSei(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShainSei(), "SHAIN_SEI"); }
    protected abstract ConditionValue xgetCValueShainSei();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAIN_MEI: {NotNull, VARCHAR(50)}
     * @param shainMei The value of shainMei as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainMei_Equal(String shainMei) {
        doSetShainMei_Equal(fRES(shainMei));
    }

    protected void doSetShainMei_Equal(String shainMei) {
        regShainMei(CK_EQ, shainMei);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAIN_MEI: {NotNull, VARCHAR(50)}
     * @param shainMei The value of shainMei as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainMei_NotEqual(String shainMei) {
        doSetShainMei_NotEqual(fRES(shainMei));
    }

    protected void doSetShainMei_NotEqual(String shainMei) {
        regShainMei(CK_NES, shainMei);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAIN_MEI: {NotNull, VARCHAR(50)}
     * @param shainMei The value of shainMei as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainMei_GreaterThan(String shainMei) {
        regShainMei(CK_GT, fRES(shainMei));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAIN_MEI: {NotNull, VARCHAR(50)}
     * @param shainMei The value of shainMei as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainMei_LessThan(String shainMei) {
        regShainMei(CK_LT, fRES(shainMei));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAIN_MEI: {NotNull, VARCHAR(50)}
     * @param shainMei The value of shainMei as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainMei_GreaterEqual(String shainMei) {
        regShainMei(CK_GE, fRES(shainMei));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAIN_MEI: {NotNull, VARCHAR(50)}
     * @param shainMei The value of shainMei as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainMei_LessEqual(String shainMei) {
        regShainMei(CK_LE, fRES(shainMei));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHAIN_MEI: {NotNull, VARCHAR(50)}
     * @param shainMeiList The collection of shainMei as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainMei_InScope(Collection<String> shainMeiList) {
        doSetShainMei_InScope(shainMeiList);
    }

    protected void doSetShainMei_InScope(Collection<String> shainMeiList) {
        regINS(CK_INS, cTL(shainMeiList), xgetCValueShainMei(), "SHAIN_MEI");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHAIN_MEI: {NotNull, VARCHAR(50)}
     * @param shainMeiList The collection of shainMei as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainMei_NotInScope(Collection<String> shainMeiList) {
        doSetShainMei_NotInScope(shainMeiList);
    }

    protected void doSetShainMei_NotInScope(Collection<String> shainMeiList) {
        regINS(CK_NINS, cTL(shainMeiList), xgetCValueShainMei(), "SHAIN_MEI");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAIN_MEI: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setShainMei_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param shainMei The value of shainMei as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setShainMei_LikeSearch(String shainMei, ConditionOptionCall<LikeSearchOption> opLambda) {
        setShainMei_LikeSearch(shainMei, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAIN_MEI: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setShainMei_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shainMei The value of shainMei as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setShainMei_LikeSearch(String shainMei, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shainMei), xgetCValueShainMei(), "SHAIN_MEI", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAIN_MEI: {NotNull, VARCHAR(50)}
     * @param shainMei The value of shainMei as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setShainMei_NotLikeSearch(String shainMei, ConditionOptionCall<LikeSearchOption> opLambda) {
        setShainMei_NotLikeSearch(shainMei, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAIN_MEI: {NotNull, VARCHAR(50)}
     * @param shainMei The value of shainMei as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setShainMei_NotLikeSearch(String shainMei, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shainMei), xgetCValueShainMei(), "SHAIN_MEI", likeSearchOption);
    }

    protected void regShainMei(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShainMei(), "SHAIN_MEI"); }
    protected abstract ConditionValue xgetCValueShainMei();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAIN_SEI_EN: {VARCHAR(100)}
     * @param shainSeiEn The value of shainSeiEn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainSeiEn_Equal(String shainSeiEn) {
        doSetShainSeiEn_Equal(fRES(shainSeiEn));
    }

    protected void doSetShainSeiEn_Equal(String shainSeiEn) {
        regShainSeiEn(CK_EQ, shainSeiEn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAIN_SEI_EN: {VARCHAR(100)}
     * @param shainSeiEn The value of shainSeiEn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainSeiEn_NotEqual(String shainSeiEn) {
        doSetShainSeiEn_NotEqual(fRES(shainSeiEn));
    }

    protected void doSetShainSeiEn_NotEqual(String shainSeiEn) {
        regShainSeiEn(CK_NES, shainSeiEn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAIN_SEI_EN: {VARCHAR(100)}
     * @param shainSeiEn The value of shainSeiEn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainSeiEn_GreaterThan(String shainSeiEn) {
        regShainSeiEn(CK_GT, fRES(shainSeiEn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAIN_SEI_EN: {VARCHAR(100)}
     * @param shainSeiEn The value of shainSeiEn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainSeiEn_LessThan(String shainSeiEn) {
        regShainSeiEn(CK_LT, fRES(shainSeiEn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAIN_SEI_EN: {VARCHAR(100)}
     * @param shainSeiEn The value of shainSeiEn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainSeiEn_GreaterEqual(String shainSeiEn) {
        regShainSeiEn(CK_GE, fRES(shainSeiEn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAIN_SEI_EN: {VARCHAR(100)}
     * @param shainSeiEn The value of shainSeiEn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainSeiEn_LessEqual(String shainSeiEn) {
        regShainSeiEn(CK_LE, fRES(shainSeiEn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHAIN_SEI_EN: {VARCHAR(100)}
     * @param shainSeiEnList The collection of shainSeiEn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainSeiEn_InScope(Collection<String> shainSeiEnList) {
        doSetShainSeiEn_InScope(shainSeiEnList);
    }

    protected void doSetShainSeiEn_InScope(Collection<String> shainSeiEnList) {
        regINS(CK_INS, cTL(shainSeiEnList), xgetCValueShainSeiEn(), "SHAIN_SEI_EN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHAIN_SEI_EN: {VARCHAR(100)}
     * @param shainSeiEnList The collection of shainSeiEn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainSeiEn_NotInScope(Collection<String> shainSeiEnList) {
        doSetShainSeiEn_NotInScope(shainSeiEnList);
    }

    protected void doSetShainSeiEn_NotInScope(Collection<String> shainSeiEnList) {
        regINS(CK_NINS, cTL(shainSeiEnList), xgetCValueShainSeiEn(), "SHAIN_SEI_EN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAIN_SEI_EN: {VARCHAR(100)} <br>
     * <pre>e.g. setShainSeiEn_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param shainSeiEn The value of shainSeiEn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setShainSeiEn_LikeSearch(String shainSeiEn, ConditionOptionCall<LikeSearchOption> opLambda) {
        setShainSeiEn_LikeSearch(shainSeiEn, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAIN_SEI_EN: {VARCHAR(100)} <br>
     * <pre>e.g. setShainSeiEn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shainSeiEn The value of shainSeiEn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setShainSeiEn_LikeSearch(String shainSeiEn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shainSeiEn), xgetCValueShainSeiEn(), "SHAIN_SEI_EN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAIN_SEI_EN: {VARCHAR(100)}
     * @param shainSeiEn The value of shainSeiEn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setShainSeiEn_NotLikeSearch(String shainSeiEn, ConditionOptionCall<LikeSearchOption> opLambda) {
        setShainSeiEn_NotLikeSearch(shainSeiEn, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAIN_SEI_EN: {VARCHAR(100)}
     * @param shainSeiEn The value of shainSeiEn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setShainSeiEn_NotLikeSearch(String shainSeiEn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shainSeiEn), xgetCValueShainSeiEn(), "SHAIN_SEI_EN", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHAIN_SEI_EN: {VARCHAR(100)}
     */
    public void setShainSeiEn_IsNull() { regShainSeiEn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHAIN_SEI_EN: {VARCHAR(100)}
     */
    public void setShainSeiEn_IsNullOrEmpty() { regShainSeiEn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHAIN_SEI_EN: {VARCHAR(100)}
     */
    public void setShainSeiEn_IsNotNull() { regShainSeiEn(CK_ISNN, DOBJ); }

    protected void regShainSeiEn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShainSeiEn(), "SHAIN_SEI_EN"); }
    protected abstract ConditionValue xgetCValueShainSeiEn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAIN_MEI_EN: {VARCHAR(100)}
     * @param shainMeiEn The value of shainMeiEn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainMeiEn_Equal(String shainMeiEn) {
        doSetShainMeiEn_Equal(fRES(shainMeiEn));
    }

    protected void doSetShainMeiEn_Equal(String shainMeiEn) {
        regShainMeiEn(CK_EQ, shainMeiEn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAIN_MEI_EN: {VARCHAR(100)}
     * @param shainMeiEn The value of shainMeiEn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainMeiEn_NotEqual(String shainMeiEn) {
        doSetShainMeiEn_NotEqual(fRES(shainMeiEn));
    }

    protected void doSetShainMeiEn_NotEqual(String shainMeiEn) {
        regShainMeiEn(CK_NES, shainMeiEn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAIN_MEI_EN: {VARCHAR(100)}
     * @param shainMeiEn The value of shainMeiEn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainMeiEn_GreaterThan(String shainMeiEn) {
        regShainMeiEn(CK_GT, fRES(shainMeiEn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAIN_MEI_EN: {VARCHAR(100)}
     * @param shainMeiEn The value of shainMeiEn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainMeiEn_LessThan(String shainMeiEn) {
        regShainMeiEn(CK_LT, fRES(shainMeiEn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAIN_MEI_EN: {VARCHAR(100)}
     * @param shainMeiEn The value of shainMeiEn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainMeiEn_GreaterEqual(String shainMeiEn) {
        regShainMeiEn(CK_GE, fRES(shainMeiEn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHAIN_MEI_EN: {VARCHAR(100)}
     * @param shainMeiEn The value of shainMeiEn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainMeiEn_LessEqual(String shainMeiEn) {
        regShainMeiEn(CK_LE, fRES(shainMeiEn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHAIN_MEI_EN: {VARCHAR(100)}
     * @param shainMeiEnList The collection of shainMeiEn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainMeiEn_InScope(Collection<String> shainMeiEnList) {
        doSetShainMeiEn_InScope(shainMeiEnList);
    }

    protected void doSetShainMeiEn_InScope(Collection<String> shainMeiEnList) {
        regINS(CK_INS, cTL(shainMeiEnList), xgetCValueShainMeiEn(), "SHAIN_MEI_EN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHAIN_MEI_EN: {VARCHAR(100)}
     * @param shainMeiEnList The collection of shainMeiEn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShainMeiEn_NotInScope(Collection<String> shainMeiEnList) {
        doSetShainMeiEn_NotInScope(shainMeiEnList);
    }

    protected void doSetShainMeiEn_NotInScope(Collection<String> shainMeiEnList) {
        regINS(CK_NINS, cTL(shainMeiEnList), xgetCValueShainMeiEn(), "SHAIN_MEI_EN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAIN_MEI_EN: {VARCHAR(100)} <br>
     * <pre>e.g. setShainMeiEn_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param shainMeiEn The value of shainMeiEn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setShainMeiEn_LikeSearch(String shainMeiEn, ConditionOptionCall<LikeSearchOption> opLambda) {
        setShainMeiEn_LikeSearch(shainMeiEn, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAIN_MEI_EN: {VARCHAR(100)} <br>
     * <pre>e.g. setShainMeiEn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shainMeiEn The value of shainMeiEn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setShainMeiEn_LikeSearch(String shainMeiEn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shainMeiEn), xgetCValueShainMeiEn(), "SHAIN_MEI_EN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAIN_MEI_EN: {VARCHAR(100)}
     * @param shainMeiEn The value of shainMeiEn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setShainMeiEn_NotLikeSearch(String shainMeiEn, ConditionOptionCall<LikeSearchOption> opLambda) {
        setShainMeiEn_NotLikeSearch(shainMeiEn, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHAIN_MEI_EN: {VARCHAR(100)}
     * @param shainMeiEn The value of shainMeiEn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setShainMeiEn_NotLikeSearch(String shainMeiEn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shainMeiEn), xgetCValueShainMeiEn(), "SHAIN_MEI_EN", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHAIN_MEI_EN: {VARCHAR(100)}
     */
    public void setShainMeiEn_IsNull() { regShainMeiEn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHAIN_MEI_EN: {VARCHAR(100)}
     */
    public void setShainMeiEn_IsNullOrEmpty() { regShainMeiEn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHAIN_MEI_EN: {VARCHAR(100)}
     */
    public void setShainMeiEn_IsNotNull() { regShainMeiEn(CK_ISNN, DOBJ); }

    protected void regShainMeiEn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShainMeiEn(), "SHAIN_MEI_EN"); }
    protected abstract ConditionValue xgetCValueShainMeiEn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGIN_CD: {NotNull, VARCHAR(50)}
     * @param loginCd The value of loginCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoginCd_Equal(String loginCd) {
        doSetLoginCd_Equal(fRES(loginCd));
    }

    protected void doSetLoginCd_Equal(String loginCd) {
        regLoginCd(CK_EQ, loginCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGIN_CD: {NotNull, VARCHAR(50)}
     * @param loginCd The value of loginCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoginCd_NotEqual(String loginCd) {
        doSetLoginCd_NotEqual(fRES(loginCd));
    }

    protected void doSetLoginCd_NotEqual(String loginCd) {
        regLoginCd(CK_NES, loginCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGIN_CD: {NotNull, VARCHAR(50)}
     * @param loginCd The value of loginCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoginCd_GreaterThan(String loginCd) {
        regLoginCd(CK_GT, fRES(loginCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGIN_CD: {NotNull, VARCHAR(50)}
     * @param loginCd The value of loginCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoginCd_LessThan(String loginCd) {
        regLoginCd(CK_LT, fRES(loginCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGIN_CD: {NotNull, VARCHAR(50)}
     * @param loginCd The value of loginCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoginCd_GreaterEqual(String loginCd) {
        regLoginCd(CK_GE, fRES(loginCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGIN_CD: {NotNull, VARCHAR(50)}
     * @param loginCd The value of loginCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoginCd_LessEqual(String loginCd) {
        regLoginCd(CK_LE, fRES(loginCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGIN_CD: {NotNull, VARCHAR(50)}
     * @param loginCdList The collection of loginCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoginCd_InScope(Collection<String> loginCdList) {
        doSetLoginCd_InScope(loginCdList);
    }

    protected void doSetLoginCd_InScope(Collection<String> loginCdList) {
        regINS(CK_INS, cTL(loginCdList), xgetCValueLoginCd(), "LOGIN_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGIN_CD: {NotNull, VARCHAR(50)}
     * @param loginCdList The collection of loginCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoginCd_NotInScope(Collection<String> loginCdList) {
        doSetLoginCd_NotInScope(loginCdList);
    }

    protected void doSetLoginCd_NotInScope(Collection<String> loginCdList) {
        regINS(CK_NINS, cTL(loginCdList), xgetCValueLoginCd(), "LOGIN_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGIN_CD: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setLoginCd_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param loginCd The value of loginCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLoginCd_LikeSearch(String loginCd, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLoginCd_LikeSearch(loginCd, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGIN_CD: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setLoginCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param loginCd The value of loginCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLoginCd_LikeSearch(String loginCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(loginCd), xgetCValueLoginCd(), "LOGIN_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGIN_CD: {NotNull, VARCHAR(50)}
     * @param loginCd The value of loginCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLoginCd_NotLikeSearch(String loginCd, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLoginCd_NotLikeSearch(loginCd, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGIN_CD: {NotNull, VARCHAR(50)}
     * @param loginCd The value of loginCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLoginCd_NotLikeSearch(String loginCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(loginCd), xgetCValueLoginCd(), "LOGIN_CD", likeSearchOption);
    }

    protected void regLoginCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLoginCd(), "LOGIN_CD"); }
    protected abstract ConditionValue xgetCValueLoginCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(100)}
     * @param password The value of password as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_Equal(String password) {
        doSetPassword_Equal(fRES(password));
    }

    protected void doSetPassword_Equal(String password) {
        regPassword(CK_EQ, password);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(100)}
     * @param password The value of password as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_NotEqual(String password) {
        doSetPassword_NotEqual(fRES(password));
    }

    protected void doSetPassword_NotEqual(String password) {
        regPassword(CK_NES, password);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(100)}
     * @param password The value of password as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_GreaterThan(String password) {
        regPassword(CK_GT, fRES(password));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(100)}
     * @param password The value of password as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_LessThan(String password) {
        regPassword(CK_LT, fRES(password));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(100)}
     * @param password The value of password as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_GreaterEqual(String password) {
        regPassword(CK_GE, fRES(password));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(100)}
     * @param password The value of password as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_LessEqual(String password) {
        regPassword(CK_LE, fRES(password));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(100)}
     * @param passwordList The collection of password as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_InScope(Collection<String> passwordList) {
        doSetPassword_InScope(passwordList);
    }

    protected void doSetPassword_InScope(Collection<String> passwordList) {
        regINS(CK_INS, cTL(passwordList), xgetCValuePassword(), "PASSWORD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(100)}
     * @param passwordList The collection of password as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPassword_NotInScope(Collection<String> passwordList) {
        doSetPassword_NotInScope(passwordList);
    }

    protected void doSetPassword_NotInScope(Collection<String> passwordList) {
        regINS(CK_NINS, cTL(passwordList), xgetCValuePassword(), "PASSWORD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setPassword_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param password The value of password as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPassword_LikeSearch(String password, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPassword_LikeSearch(password, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(100)} <br>
     * <pre>e.g. setPassword_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param password The value of password as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPassword_LikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(password), xgetCValuePassword(), "PASSWORD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(100)}
     * @param password The value of password as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPassword_NotLikeSearch(String password, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPassword_NotLikeSearch(password, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(100)}
     * @param password The value of password as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPassword_NotLikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(password), xgetCValuePassword(), "PASSWORD", likeSearchOption);
    }

    protected void regPassword(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePassword(), "PASSWORD"); }
    protected abstract ConditionValue xgetCValuePassword();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegUserId_Equal(String regUserId) {
        doSetRegUserId_Equal(fRES(regUserId));
    }

    protected void doSetRegUserId_Equal(String regUserId) {
        regRegUserId(CK_EQ, regUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegUserId_NotEqual(String regUserId) {
        doSetRegUserId_NotEqual(fRES(regUserId));
    }

    protected void doSetRegUserId_NotEqual(String regUserId) {
        regRegUserId(CK_NES, regUserId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegUserId_GreaterThan(String regUserId) {
        regRegUserId(CK_GT, fRES(regUserId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegUserId_LessThan(String regUserId) {
        regRegUserId(CK_LT, fRES(regUserId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegUserId_GreaterEqual(String regUserId) {
        regRegUserId(CK_GE, fRES(regUserId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegUserId_LessEqual(String regUserId) {
        regRegUserId(CK_LE, fRES(regUserId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserIdList The collection of regUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegUserId_InScope(Collection<String> regUserIdList) {
        doSetRegUserId_InScope(regUserIdList);
    }

    protected void doSetRegUserId_InScope(Collection<String> regUserIdList) {
        regINS(CK_INS, cTL(regUserIdList), xgetCValueRegUserId(), "REG_USER_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserIdList The collection of regUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegUserId_NotInScope(Collection<String> regUserIdList) {
        doSetRegUserId_NotInScope(regUserIdList);
    }

    protected void doSetRegUserId_NotInScope(Collection<String> regUserIdList) {
        regINS(CK_NINS, cTL(regUserIdList), xgetCValueRegUserId(), "REG_USER_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setRegUserId_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param regUserId The value of regUserId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegUserId_LikeSearch(String regUserId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegUserId_LikeSearch(regUserId, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setRegUserId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param regUserId The value of regUserId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRegUserId_LikeSearch(String regUserId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(regUserId), xgetCValueRegUserId(), "REG_USER_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegUserId_NotLikeSearch(String regUserId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegUserId_NotLikeSearch(regUserId, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_USER_ID: {NotNull, VARCHAR(10)}
     * @param regUserId The value of regUserId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRegUserId_NotLikeSearch(String regUserId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(regUserId), xgetCValueRegUserId(), "REG_USER_ID", likeSearchOption);
    }

    protected void regRegUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegUserId(), "REG_USER_ID"); }
    protected abstract ConditionValue xgetCValueRegUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param regTm The value of regTm as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegTm_Equal(java.time.LocalDateTime regTm) {
        regRegTm(CK_EQ,  regTm);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param regTm The value of regTm as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegTm_GreaterThan(java.time.LocalDateTime regTm) {
        regRegTm(CK_GT,  regTm);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param regTm The value of regTm as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegTm_LessThan(java.time.LocalDateTime regTm) {
        regRegTm(CK_LT,  regTm);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param regTm The value of regTm as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegTm_GreaterEqual(java.time.LocalDateTime regTm) {
        regRegTm(CK_GE,  regTm);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param regTm The value of regTm as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegTm_LessEqual(java.time.LocalDateTime regTm) {
        regRegTm(CK_LE, regTm);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setRegTm_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of regTm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of regTm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegTm_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegTm_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REG_TM: {NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setRegTm_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of regTm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of regTm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegTm_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "REG_TM"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegTm(), nm, op);
    }

    protected void regRegTm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegTm(), "REG_TM"); }
    protected abstract ConditionValue xgetCValueRegTm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegFuncCd_Equal(String regFuncCd) {
        doSetRegFuncCd_Equal(fRES(regFuncCd));
    }

    protected void doSetRegFuncCd_Equal(String regFuncCd) {
        regRegFuncCd(CK_EQ, regFuncCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegFuncCd_NotEqual(String regFuncCd) {
        doSetRegFuncCd_NotEqual(fRES(regFuncCd));
    }

    protected void doSetRegFuncCd_NotEqual(String regFuncCd) {
        regRegFuncCd(CK_NES, regFuncCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegFuncCd_GreaterThan(String regFuncCd) {
        regRegFuncCd(CK_GT, fRES(regFuncCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegFuncCd_LessThan(String regFuncCd) {
        regRegFuncCd(CK_LT, fRES(regFuncCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegFuncCd_GreaterEqual(String regFuncCd) {
        regRegFuncCd(CK_GE, fRES(regFuncCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegFuncCd_LessEqual(String regFuncCd) {
        regRegFuncCd(CK_LE, fRES(regFuncCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCdList The collection of regFuncCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegFuncCd_InScope(Collection<String> regFuncCdList) {
        doSetRegFuncCd_InScope(regFuncCdList);
    }

    protected void doSetRegFuncCd_InScope(Collection<String> regFuncCdList) {
        regINS(CK_INS, cTL(regFuncCdList), xgetCValueRegFuncCd(), "REG_FUNC_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCdList The collection of regFuncCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRegFuncCd_NotInScope(Collection<String> regFuncCdList) {
        doSetRegFuncCd_NotInScope(regFuncCdList);
    }

    protected void doSetRegFuncCd_NotInScope(Collection<String> regFuncCdList) {
        regINS(CK_NINS, cTL(regFuncCdList), xgetCValueRegFuncCd(), "REG_FUNC_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)} <br>
     * <pre>e.g. setRegFuncCd_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param regFuncCd The value of regFuncCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegFuncCd_LikeSearch(String regFuncCd, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegFuncCd_LikeSearch(regFuncCd, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)} <br>
     * <pre>e.g. setRegFuncCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param regFuncCd The value of regFuncCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setRegFuncCd_LikeSearch(String regFuncCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(regFuncCd), xgetCValueRegFuncCd(), "REG_FUNC_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setRegFuncCd_NotLikeSearch(String regFuncCd, ConditionOptionCall<LikeSearchOption> opLambda) {
        setRegFuncCd_NotLikeSearch(regFuncCd, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REG_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param regFuncCd The value of regFuncCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setRegFuncCd_NotLikeSearch(String regFuncCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(regFuncCd), xgetCValueRegFuncCd(), "REG_FUNC_CD", likeSearchOption);
    }

    protected void regRegFuncCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegFuncCd(), "REG_FUNC_CD"); }
    protected abstract ConditionValue xgetCValueRegFuncCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdUserId_Equal(String updUserId) {
        doSetUpdUserId_Equal(fRES(updUserId));
    }

    protected void doSetUpdUserId_Equal(String updUserId) {
        regUpdUserId(CK_EQ, updUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdUserId_NotEqual(String updUserId) {
        doSetUpdUserId_NotEqual(fRES(updUserId));
    }

    protected void doSetUpdUserId_NotEqual(String updUserId) {
        regUpdUserId(CK_NES, updUserId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdUserId_GreaterThan(String updUserId) {
        regUpdUserId(CK_GT, fRES(updUserId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdUserId_LessThan(String updUserId) {
        regUpdUserId(CK_LT, fRES(updUserId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdUserId_GreaterEqual(String updUserId) {
        regUpdUserId(CK_GE, fRES(updUserId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdUserId_LessEqual(String updUserId) {
        regUpdUserId(CK_LE, fRES(updUserId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserIdList The collection of updUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdUserId_InScope(Collection<String> updUserIdList) {
        doSetUpdUserId_InScope(updUserIdList);
    }

    protected void doSetUpdUserId_InScope(Collection<String> updUserIdList) {
        regINS(CK_INS, cTL(updUserIdList), xgetCValueUpdUserId(), "UPD_USER_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserIdList The collection of updUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdUserId_NotInScope(Collection<String> updUserIdList) {
        doSetUpdUserId_NotInScope(updUserIdList);
    }

    protected void doSetUpdUserId_NotInScope(Collection<String> updUserIdList) {
        regINS(CK_NINS, cTL(updUserIdList), xgetCValueUpdUserId(), "UPD_USER_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setUpdUserId_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updUserId The value of updUserId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdUserId_LikeSearch(String updUserId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdUserId_LikeSearch(updUserId, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setUpdUserId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updUserId The value of updUserId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUpdUserId_LikeSearch(String updUserId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updUserId), xgetCValueUpdUserId(), "UPD_USER_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdUserId_NotLikeSearch(String updUserId, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdUserId_NotLikeSearch(updUserId, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_USER_ID: {NotNull, VARCHAR(10)}
     * @param updUserId The value of updUserId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUpdUserId_NotLikeSearch(String updUserId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updUserId), xgetCValueUpdUserId(), "UPD_USER_ID", likeSearchOption);
    }

    protected void regUpdUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdUserId(), "UPD_USER_ID"); }
    protected abstract ConditionValue xgetCValueUpdUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param updTm The value of updTm as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdTm_Equal(java.time.LocalDateTime updTm) {
        regUpdTm(CK_EQ,  updTm);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param updTm The value of updTm as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdTm_GreaterThan(java.time.LocalDateTime updTm) {
        regUpdTm(CK_GT,  updTm);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param updTm The value of updTm as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdTm_LessThan(java.time.LocalDateTime updTm) {
        regUpdTm(CK_LT,  updTm);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param updTm The value of updTm as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdTm_GreaterEqual(java.time.LocalDateTime updTm) {
        regUpdTm(CK_GE,  updTm);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * @param updTm The value of updTm as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUpdTm_LessEqual(java.time.LocalDateTime updTm) {
        regUpdTm(CK_LE, updTm);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setUpdTm_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updTm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updTm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setUpdTm_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setUpdTm_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * UPD_TM: {NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setUpdTm_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updTm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of updTm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setUpdTm_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "UPD_TM"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueUpdTm(), nm, op);
    }

    protected void regUpdTm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdTm(), "UPD_TM"); }
    protected abstract ConditionValue xgetCValueUpdTm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdFuncCd_Equal(String updFuncCd) {
        doSetUpdFuncCd_Equal(fRES(updFuncCd));
    }

    protected void doSetUpdFuncCd_Equal(String updFuncCd) {
        regUpdFuncCd(CK_EQ, updFuncCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdFuncCd_NotEqual(String updFuncCd) {
        doSetUpdFuncCd_NotEqual(fRES(updFuncCd));
    }

    protected void doSetUpdFuncCd_NotEqual(String updFuncCd) {
        regUpdFuncCd(CK_NES, updFuncCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdFuncCd_GreaterThan(String updFuncCd) {
        regUpdFuncCd(CK_GT, fRES(updFuncCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdFuncCd_LessThan(String updFuncCd) {
        regUpdFuncCd(CK_LT, fRES(updFuncCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdFuncCd_GreaterEqual(String updFuncCd) {
        regUpdFuncCd(CK_GE, fRES(updFuncCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdFuncCd_LessEqual(String updFuncCd) {
        regUpdFuncCd(CK_LE, fRES(updFuncCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCdList The collection of updFuncCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdFuncCd_InScope(Collection<String> updFuncCdList) {
        doSetUpdFuncCd_InScope(updFuncCdList);
    }

    protected void doSetUpdFuncCd_InScope(Collection<String> updFuncCdList) {
        regINS(CK_INS, cTL(updFuncCdList), xgetCValueUpdFuncCd(), "UPD_FUNC_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCdList The collection of updFuncCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdFuncCd_NotInScope(Collection<String> updFuncCdList) {
        doSetUpdFuncCd_NotInScope(updFuncCdList);
    }

    protected void doSetUpdFuncCd_NotInScope(Collection<String> updFuncCdList) {
        regINS(CK_NINS, cTL(updFuncCdList), xgetCValueUpdFuncCd(), "UPD_FUNC_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)} <br>
     * <pre>e.g. setUpdFuncCd_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param updFuncCd The value of updFuncCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdFuncCd_LikeSearch(String updFuncCd, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdFuncCd_LikeSearch(updFuncCd, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)} <br>
     * <pre>e.g. setUpdFuncCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param updFuncCd The value of updFuncCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUpdFuncCd_LikeSearch(String updFuncCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(updFuncCd), xgetCValueUpdFuncCd(), "UPD_FUNC_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUpdFuncCd_NotLikeSearch(String updFuncCd, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUpdFuncCd_NotLikeSearch(updFuncCd, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPD_FUNC_CD: {NotNull, VARCHAR(9)}
     * @param updFuncCd The value of updFuncCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUpdFuncCd_NotLikeSearch(String updFuncCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(updFuncCd), xgetCValueUpdFuncCd(), "UPD_FUNC_CD", likeSearchOption);
    }

    protected void regUpdFuncCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUpdFuncCd(), "UPD_FUNC_CD"); }
    protected abstract ConditionValue xgetCValueUpdFuncCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNo The value of versionNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_Equal(Integer versionNo) {
        doSetVersionNo_Equal(versionNo);
    }

    protected void doSetVersionNo_Equal(Integer versionNo) {
        regVersionNo(CK_EQ, versionNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNo The value of versionNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_NotEqual(Integer versionNo) {
        doSetVersionNo_NotEqual(versionNo);
    }

    protected void doSetVersionNo_NotEqual(Integer versionNo) {
        regVersionNo(CK_NES, versionNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNo The value of versionNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_GreaterThan(Integer versionNo) {
        regVersionNo(CK_GT, versionNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNo The value of versionNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_LessThan(Integer versionNo) {
        regVersionNo(CK_LT, versionNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNo The value of versionNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_GreaterEqual(Integer versionNo) {
        regVersionNo(CK_GE, versionNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNo The value of versionNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setVersionNo_LessEqual(Integer versionNo) {
        regVersionNo(CK_LE, versionNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param minNumber The min number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setVersionNo_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param minNumber The min number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setVersionNo_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNoList The collection of versionNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVersionNo_InScope(Collection<Integer> versionNoList) {
        doSetVersionNo_InScope(versionNoList);
    }

    protected void doSetVersionNo_InScope(Collection<Integer> versionNoList) {
        regINS(CK_INS, cTL(versionNoList), xgetCValueVersionNo(), "VERSION_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * VERSION_NO: {NotNull, DECIMAL(9)}
     * @param versionNoList The collection of versionNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVersionNo_NotInScope(Collection<Integer> versionNoList) {
        doSetVersionNo_NotInScope(versionNoList);
    }

    protected void doSetVersionNo_NotInScope(Collection<Integer> versionNoList) {
        regINS(CK_NINS, cTL(versionNoList), xgetCValueVersionNo(), "VERSION_NO");
    }

    protected void regVersionNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVersionNo(), "VERSION_NO"); }
    protected abstract ConditionValue xgetCValueVersionNo();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CmShainCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, CmShainCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CmShainCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, CmShainCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CmShainCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, CmShainCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CmShainCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, CmShainCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CmShainCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, CmShainCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;CmShainCB&gt;() {
     *     public void query(CmShainCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CmShainCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, CmShainCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        CmShainCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(CmShainCQ sq);

    protected CmShainCB xcreateScalarConditionCB() {
        CmShainCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected CmShainCB xcreateScalarConditionPartitionByCB() {
        CmShainCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<CmShainCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CmShainCB cb = new CmShainCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CM_SHAIN_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(CmShainCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<CmShainCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(CmShainCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CmShainCB cb = new CmShainCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CM_SHAIN_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(CmShainCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<CmShainCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CmShainCB cb = new CmShainCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(CmShainCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected CmShainCB newMyCB() {
        return new CmShainCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return CmShainCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
