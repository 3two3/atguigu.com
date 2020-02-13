package com.atguigu.gmall.pms;

import com.atguigu.gmall.pms.entity.Brand;
import com.atguigu.gmall.pms.service.BrandService;
import com.atguigu.gmall.pms.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallPmsApplicationTests {

	@Autowired
	ProductService productService;

	@Autowired
	BrandService brandService;

	@Test
	public void contextLoads() {
//		Product byId = productService.getById(1);
//		System.out.println(byId.getName());

		//        Product byId = productService.getById(1);
//        System.out.println(byId.getName());
		//测试增删改在主库，查在从库
        Brand brand = new Brand();
        brand.setName("哈哈哈");
        brandService.save(brand);
		System.out.println("保存成功....");
		//Brand byId = brandService.getById(53);
		//System.out.println("保存成功...."+byId.getName());
	}

}
