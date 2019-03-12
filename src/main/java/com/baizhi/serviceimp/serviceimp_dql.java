package com.baizhi.serviceimp;

import com.baizhi.service.service_dql;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class serviceimp_dql implements service_dql {


}
