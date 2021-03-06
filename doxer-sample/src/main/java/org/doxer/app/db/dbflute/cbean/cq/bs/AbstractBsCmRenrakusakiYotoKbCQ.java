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
 * The abstract condition-query of CM_RENRAKUSAKI_YOTO_KB.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsCmRenrakusakiYotoKbCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsCmRenrakusakiYotoKbCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "CM_RENRAKUSAKI_YOTO_KB";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_VAL: {PK, NotNull, CHAR(3), classification=RenrakusakiYotoKb}
     * @param kbVal The value of kbVal as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setKbVal_Equal(String kbVal) {
        doSetKbVal_Equal(fRES(kbVal));
    }

    /**
     * Equal(=). As RenrakusakiYotoKb. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_VAL: {PK, NotNull, CHAR(3), classification=RenrakusakiYotoKb} <br>
     * 連絡先用途区分(通常、緊急)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setKbVal_Equal_AsRenrakusakiYotoKb(CDef.RenrakusakiYotoKb cdef) {
        doSetKbVal_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As Normal (NRM). And OnlyOnceRegistered. <br>
     * Normal
     */
    public void setKbVal_Equal_Normal() {
        setKbVal_Equal_AsRenrakusakiYotoKb(CDef.RenrakusakiYotoKb.Normal);
    }

    /**
     * Equal(=). As Emergency (EMG). And OnlyOnceRegistered. <br>
     * Emergency
     */
    public void setKbVal_Equal_Emergency() {
        setKbVal_Equal_AsRenrakusakiYotoKb(CDef.RenrakusakiYotoKb.Emergency);
    }

    protected void doSetKbVal_Equal(String kbVal) {
        regKbVal(CK_EQ, kbVal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_VAL: {PK, NotNull, CHAR(3), classification=RenrakusakiYotoKb}
     * @param kbVal The value of kbVal as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setKbVal_NotEqual(String kbVal) {
        doSetKbVal_NotEqual(fRES(kbVal));
    }

    /**
     * NotEqual(&lt;&gt;). As RenrakusakiYotoKb. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_VAL: {PK, NotNull, CHAR(3), classification=RenrakusakiYotoKb} <br>
     * 連絡先用途区分(通常、緊急)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setKbVal_NotEqual_AsRenrakusakiYotoKb(CDef.RenrakusakiYotoKb cdef) {
        doSetKbVal_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As Normal (NRM). And OnlyOnceRegistered. <br>
     * Normal
     */
    public void setKbVal_NotEqual_Normal() {
        setKbVal_NotEqual_AsRenrakusakiYotoKb(CDef.RenrakusakiYotoKb.Normal);
    }

    /**
     * NotEqual(&lt;&gt;). As Emergency (EMG). And OnlyOnceRegistered. <br>
     * Emergency
     */
    public void setKbVal_NotEqual_Emergency() {
        setKbVal_NotEqual_AsRenrakusakiYotoKb(CDef.RenrakusakiYotoKb.Emergency);
    }

    protected void doSetKbVal_NotEqual(String kbVal) {
        regKbVal(CK_NES, kbVal);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KB_VAL: {PK, NotNull, CHAR(3), classification=RenrakusakiYotoKb}
     * @param kbValList The collection of kbVal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setKbVal_InScope(Collection<String> kbValList) {
        doSetKbVal_InScope(kbValList);
    }

    /**
     * InScope {in ('a', 'b')}. As RenrakusakiYotoKb. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KB_VAL: {PK, NotNull, CHAR(3), classification=RenrakusakiYotoKb} <br>
     * 連絡先用途区分(通常、緊急)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbVal_InScope_AsRenrakusakiYotoKb(Collection<CDef.RenrakusakiYotoKb> cdefList) {
        doSetKbVal_InScope(cTStrL(cdefList));
    }

    protected void doSetKbVal_InScope(Collection<String> kbValList) {
        regINS(CK_INS, cTL(kbValList), xgetCValueKbVal(), "KB_VAL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KB_VAL: {PK, NotNull, CHAR(3), classification=RenrakusakiYotoKb}
     * @param kbValList The collection of kbVal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    protected void setKbVal_NotInScope(Collection<String> kbValList) {
        doSetKbVal_NotInScope(kbValList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As RenrakusakiYotoKb. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KB_VAL: {PK, NotNull, CHAR(3), classification=RenrakusakiYotoKb} <br>
     * 連絡先用途区分(通常、緊急)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbVal_NotInScope_AsRenrakusakiYotoKb(Collection<CDef.RenrakusakiYotoKb> cdefList) {
        doSetKbVal_NotInScope(cTStrL(cdefList));
    }

    protected void doSetKbVal_NotInScope(Collection<String> kbValList) {
        regINS(CK_NINS, cTL(kbValList), xgetCValueKbVal(), "KB_VAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KB_VAL: {PK, NotNull, CHAR(3), classification=RenrakusakiYotoKb}
     */
    public void setKbVal_IsNull() { regKbVal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KB_VAL: {PK, NotNull, CHAR(3), classification=RenrakusakiYotoKb}
     */
    public void setKbVal_IsNotNull() { regKbVal(CK_ISNN, DOBJ); }

    protected void regKbVal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKbVal(), "KB_VAL"); }
    protected abstract ConditionValue xgetCValueKbVal();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_MEI: {NotNull, VARCHAR(50)}
     * @param kbMei The value of kbMei as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbMei_Equal(String kbMei) {
        doSetKbMei_Equal(fRES(kbMei));
    }

    protected void doSetKbMei_Equal(String kbMei) {
        regKbMei(CK_EQ, kbMei);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_MEI: {NotNull, VARCHAR(50)}
     * @param kbMei The value of kbMei as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbMei_NotEqual(String kbMei) {
        doSetKbMei_NotEqual(fRES(kbMei));
    }

    protected void doSetKbMei_NotEqual(String kbMei) {
        regKbMei(CK_NES, kbMei);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_MEI: {NotNull, VARCHAR(50)}
     * @param kbMei The value of kbMei as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbMei_GreaterThan(String kbMei) {
        regKbMei(CK_GT, fRES(kbMei));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_MEI: {NotNull, VARCHAR(50)}
     * @param kbMei The value of kbMei as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbMei_LessThan(String kbMei) {
        regKbMei(CK_LT, fRES(kbMei));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_MEI: {NotNull, VARCHAR(50)}
     * @param kbMei The value of kbMei as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbMei_GreaterEqual(String kbMei) {
        regKbMei(CK_GE, fRES(kbMei));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_MEI: {NotNull, VARCHAR(50)}
     * @param kbMei The value of kbMei as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbMei_LessEqual(String kbMei) {
        regKbMei(CK_LE, fRES(kbMei));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KB_MEI: {NotNull, VARCHAR(50)}
     * @param kbMeiList The collection of kbMei as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbMei_InScope(Collection<String> kbMeiList) {
        doSetKbMei_InScope(kbMeiList);
    }

    protected void doSetKbMei_InScope(Collection<String> kbMeiList) {
        regINS(CK_INS, cTL(kbMeiList), xgetCValueKbMei(), "KB_MEI");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KB_MEI: {NotNull, VARCHAR(50)}
     * @param kbMeiList The collection of kbMei as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbMei_NotInScope(Collection<String> kbMeiList) {
        doSetKbMei_NotInScope(kbMeiList);
    }

    protected void doSetKbMei_NotInScope(Collection<String> kbMeiList) {
        regINS(CK_NINS, cTL(kbMeiList), xgetCValueKbMei(), "KB_MEI");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KB_MEI: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setKbMei_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param kbMei The value of kbMei as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setKbMei_LikeSearch(String kbMei, ConditionOptionCall<LikeSearchOption> opLambda) {
        setKbMei_LikeSearch(kbMei, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KB_MEI: {NotNull, VARCHAR(50)} <br>
     * <pre>e.g. setKbMei_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kbMei The value of kbMei as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setKbMei_LikeSearch(String kbMei, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kbMei), xgetCValueKbMei(), "KB_MEI", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KB_MEI: {NotNull, VARCHAR(50)}
     * @param kbMei The value of kbMei as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setKbMei_NotLikeSearch(String kbMei, ConditionOptionCall<LikeSearchOption> opLambda) {
        setKbMei_NotLikeSearch(kbMei, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KB_MEI: {NotNull, VARCHAR(50)}
     * @param kbMei The value of kbMei as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setKbMei_NotLikeSearch(String kbMei, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kbMei), xgetCValueKbMei(), "KB_MEI", likeSearchOption);
    }

    protected void regKbMei(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKbMei(), "KB_MEI"); }
    protected abstract ConditionValue xgetCValueKbMei();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_MEI_EN: {VARCHAR(100)}
     * @param kbMeiEn The value of kbMeiEn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbMeiEn_Equal(String kbMeiEn) {
        doSetKbMeiEn_Equal(fRES(kbMeiEn));
    }

    protected void doSetKbMeiEn_Equal(String kbMeiEn) {
        regKbMeiEn(CK_EQ, kbMeiEn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_MEI_EN: {VARCHAR(100)}
     * @param kbMeiEn The value of kbMeiEn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbMeiEn_NotEqual(String kbMeiEn) {
        doSetKbMeiEn_NotEqual(fRES(kbMeiEn));
    }

    protected void doSetKbMeiEn_NotEqual(String kbMeiEn) {
        regKbMeiEn(CK_NES, kbMeiEn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_MEI_EN: {VARCHAR(100)}
     * @param kbMeiEn The value of kbMeiEn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbMeiEn_GreaterThan(String kbMeiEn) {
        regKbMeiEn(CK_GT, fRES(kbMeiEn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_MEI_EN: {VARCHAR(100)}
     * @param kbMeiEn The value of kbMeiEn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbMeiEn_LessThan(String kbMeiEn) {
        regKbMeiEn(CK_LT, fRES(kbMeiEn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_MEI_EN: {VARCHAR(100)}
     * @param kbMeiEn The value of kbMeiEn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbMeiEn_GreaterEqual(String kbMeiEn) {
        regKbMeiEn(CK_GE, fRES(kbMeiEn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_MEI_EN: {VARCHAR(100)}
     * @param kbMeiEn The value of kbMeiEn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbMeiEn_LessEqual(String kbMeiEn) {
        regKbMeiEn(CK_LE, fRES(kbMeiEn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KB_MEI_EN: {VARCHAR(100)}
     * @param kbMeiEnList The collection of kbMeiEn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbMeiEn_InScope(Collection<String> kbMeiEnList) {
        doSetKbMeiEn_InScope(kbMeiEnList);
    }

    protected void doSetKbMeiEn_InScope(Collection<String> kbMeiEnList) {
        regINS(CK_INS, cTL(kbMeiEnList), xgetCValueKbMeiEn(), "KB_MEI_EN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KB_MEI_EN: {VARCHAR(100)}
     * @param kbMeiEnList The collection of kbMeiEn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbMeiEn_NotInScope(Collection<String> kbMeiEnList) {
        doSetKbMeiEn_NotInScope(kbMeiEnList);
    }

    protected void doSetKbMeiEn_NotInScope(Collection<String> kbMeiEnList) {
        regINS(CK_NINS, cTL(kbMeiEnList), xgetCValueKbMeiEn(), "KB_MEI_EN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KB_MEI_EN: {VARCHAR(100)} <br>
     * <pre>e.g. setKbMeiEn_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param kbMeiEn The value of kbMeiEn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setKbMeiEn_LikeSearch(String kbMeiEn, ConditionOptionCall<LikeSearchOption> opLambda) {
        setKbMeiEn_LikeSearch(kbMeiEn, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KB_MEI_EN: {VARCHAR(100)} <br>
     * <pre>e.g. setKbMeiEn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kbMeiEn The value of kbMeiEn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setKbMeiEn_LikeSearch(String kbMeiEn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kbMeiEn), xgetCValueKbMeiEn(), "KB_MEI_EN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KB_MEI_EN: {VARCHAR(100)}
     * @param kbMeiEn The value of kbMeiEn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setKbMeiEn_NotLikeSearch(String kbMeiEn, ConditionOptionCall<LikeSearchOption> opLambda) {
        setKbMeiEn_NotLikeSearch(kbMeiEn, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KB_MEI_EN: {VARCHAR(100)}
     * @param kbMeiEn The value of kbMeiEn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setKbMeiEn_NotLikeSearch(String kbMeiEn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kbMeiEn), xgetCValueKbMeiEn(), "KB_MEI_EN", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KB_MEI_EN: {VARCHAR(100)}
     */
    public void setKbMeiEn_IsNull() { regKbMeiEn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KB_MEI_EN: {VARCHAR(100)}
     */
    public void setKbMeiEn_IsNullOrEmpty() { regKbMeiEn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KB_MEI_EN: {VARCHAR(100)}
     */
    public void setKbMeiEn_IsNotNull() { regKbMeiEn(CK_ISNN, DOBJ); }

    protected void regKbMeiEn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKbMeiEn(), "KB_MEI_EN"); }
    protected abstract ConditionValue xgetCValueKbMeiEn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_REM: {NotNull, VARCHAR(15)}
     * @param kbRem The value of kbRem as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbRem_Equal(String kbRem) {
        doSetKbRem_Equal(fRES(kbRem));
    }

    protected void doSetKbRem_Equal(String kbRem) {
        regKbRem(CK_EQ, kbRem);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_REM: {NotNull, VARCHAR(15)}
     * @param kbRem The value of kbRem as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbRem_NotEqual(String kbRem) {
        doSetKbRem_NotEqual(fRES(kbRem));
    }

    protected void doSetKbRem_NotEqual(String kbRem) {
        regKbRem(CK_NES, kbRem);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_REM: {NotNull, VARCHAR(15)}
     * @param kbRem The value of kbRem as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbRem_GreaterThan(String kbRem) {
        regKbRem(CK_GT, fRES(kbRem));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_REM: {NotNull, VARCHAR(15)}
     * @param kbRem The value of kbRem as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbRem_LessThan(String kbRem) {
        regKbRem(CK_LT, fRES(kbRem));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_REM: {NotNull, VARCHAR(15)}
     * @param kbRem The value of kbRem as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbRem_GreaterEqual(String kbRem) {
        regKbRem(CK_GE, fRES(kbRem));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KB_REM: {NotNull, VARCHAR(15)}
     * @param kbRem The value of kbRem as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbRem_LessEqual(String kbRem) {
        regKbRem(CK_LE, fRES(kbRem));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KB_REM: {NotNull, VARCHAR(15)}
     * @param kbRemList The collection of kbRem as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbRem_InScope(Collection<String> kbRemList) {
        doSetKbRem_InScope(kbRemList);
    }

    protected void doSetKbRem_InScope(Collection<String> kbRemList) {
        regINS(CK_INS, cTL(kbRemList), xgetCValueKbRem(), "KB_REM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KB_REM: {NotNull, VARCHAR(15)}
     * @param kbRemList The collection of kbRem as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKbRem_NotInScope(Collection<String> kbRemList) {
        doSetKbRem_NotInScope(kbRemList);
    }

    protected void doSetKbRem_NotInScope(Collection<String> kbRemList) {
        regINS(CK_NINS, cTL(kbRemList), xgetCValueKbRem(), "KB_REM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KB_REM: {NotNull, VARCHAR(15)} <br>
     * <pre>e.g. setKbRem_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param kbRem The value of kbRem as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setKbRem_LikeSearch(String kbRem, ConditionOptionCall<LikeSearchOption> opLambda) {
        setKbRem_LikeSearch(kbRem, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KB_REM: {NotNull, VARCHAR(15)} <br>
     * <pre>e.g. setKbRem_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kbRem The value of kbRem as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setKbRem_LikeSearch(String kbRem, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kbRem), xgetCValueKbRem(), "KB_REM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KB_REM: {NotNull, VARCHAR(15)}
     * @param kbRem The value of kbRem as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setKbRem_NotLikeSearch(String kbRem, ConditionOptionCall<LikeSearchOption> opLambda) {
        setKbRem_NotLikeSearch(kbRem, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KB_REM: {NotNull, VARCHAR(15)}
     * @param kbRem The value of kbRem as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setKbRem_NotLikeSearch(String kbRem, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kbRem), xgetCValueKbRem(), "KB_REM", likeSearchOption);
    }

    protected void regKbRem(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKbRem(), "KB_REM"); }
    protected abstract ConditionValue xgetCValueKbRem();

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
    public HpSLCFunction<CmRenrakusakiYotoKbCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, CmRenrakusakiYotoKbCB.class);
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
    public HpSLCFunction<CmRenrakusakiYotoKbCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, CmRenrakusakiYotoKbCB.class);
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
    public HpSLCFunction<CmRenrakusakiYotoKbCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, CmRenrakusakiYotoKbCB.class);
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
    public HpSLCFunction<CmRenrakusakiYotoKbCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, CmRenrakusakiYotoKbCB.class);
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
    public HpSLCFunction<CmRenrakusakiYotoKbCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, CmRenrakusakiYotoKbCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;CmRenrakusakiYotoKbCB&gt;() {
     *     public void query(CmRenrakusakiYotoKbCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<CmRenrakusakiYotoKbCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, CmRenrakusakiYotoKbCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        CmRenrakusakiYotoKbCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(CmRenrakusakiYotoKbCQ sq);

    protected CmRenrakusakiYotoKbCB xcreateScalarConditionCB() {
        CmRenrakusakiYotoKbCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected CmRenrakusakiYotoKbCB xcreateScalarConditionPartitionByCB() {
        CmRenrakusakiYotoKbCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<CmRenrakusakiYotoKbCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CmRenrakusakiYotoKbCB cb = new CmRenrakusakiYotoKbCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "KB_VAL";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(CmRenrakusakiYotoKbCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<CmRenrakusakiYotoKbCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(CmRenrakusakiYotoKbCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        CmRenrakusakiYotoKbCB cb = new CmRenrakusakiYotoKbCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "KB_VAL";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(CmRenrakusakiYotoKbCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<CmRenrakusakiYotoKbCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        CmRenrakusakiYotoKbCB cb = new CmRenrakusakiYotoKbCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(CmRenrakusakiYotoKbCQ sq);

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
    protected CmRenrakusakiYotoKbCB newMyCB() {
        return new CmRenrakusakiYotoKbCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return CmRenrakusakiYotoKbCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
