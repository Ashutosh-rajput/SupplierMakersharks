package AshutoshRajput.Makersharks.Config;

import AshutoshRajput.Makersharks.Entity.Supplier;
import AshutoshRajput.Makersharks.Mapper.SupplierMapper;
import AshutoshRajput.Makersharks.Service.ServiceImpl.SupplierServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
    @Bean
    public SupplierMapper supplierMapper(){
        return new SupplierMapper();
    }
//    @Bean
//    public SupplierServiceImpl supplierService(){
//        return new SupplierServiceImpl();
//    }
}
