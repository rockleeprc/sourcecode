package org.smart4j.chapter5.soap;

import org.smart4j.chapter5.model.Customer;
import org.smart4j.chapter5.service.CustomerService;
import org.smart4j.framework.annotation.Inject;
import org.smart4j.framework.annotation.Service;
import org.smart4j.plugin.soap.Soap;

/**
 * 客户 SOAP 服务接口实现
 *
 * @author huangyong
 * @since 1.0.0
 */
@Soap
@Service
public class CustomerSoapServiceImpl implements CustomerSoapService {

    @Inject
    private CustomerService customerService;

    public Customer getCustomer(long customerId) {
        return customerService.getCustomer(customerId);
    }
}
