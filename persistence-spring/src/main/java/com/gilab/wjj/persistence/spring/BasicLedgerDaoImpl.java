package com.gilab.wjj.persistence.spring;

import com.gilab.wjj.persistence.dao.BasicLedgerDao;
import com.gilab.wjj.persistence.mapper.BasicLedgerMapper;
import com.gilab.wjj.persistence.model.BasicLedger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yuankui on 12/17/17.
 * <p>
 * Desc:
 * <p>
 * Change:
 */
@Repository("BasicLedgerDao")
public class BasicLedgerDaoImpl implements BasicLedgerDao {
    @Autowired
    private BasicLedgerMapper mapper;

    @Override
    public List<BasicLedger> getLedger(long contractId) {
        return mapper.getLedger(contractId);
    }

    @Override
    public void batchUpdateLedgers(List<BasicLedger> ledgers) {
        mapper.batchUpdateLedgers(ledgers);
    }
}
