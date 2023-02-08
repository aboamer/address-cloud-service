package com.cloud.addresscloudservice.controller;

import com.cloud.addresscloudservice.request.CreateAddressRequest;
import com.cloud.addresscloudservice.response.AddressResponse;
import com.cloud.addresscloudservice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@RefreshScope
@RestController
@RequestMapping("/api/address")
public class AddressController {

	@Autowired
	AddressService addressService;

	@Value("${reload.message}")
	private String reloadMessage;

	@PostMapping("/create")
	public AddressResponse createAddress (@RequestBody CreateAddressRequest createAddressRequest) {
		return addressService.createAddress(createAddressRequest);
	}
	
	@GetMapping("/getById/{id}")
	public AddressResponse getById(@PathVariable long id) {

		return addressService.getById(id);
	}

	@GetMapping("/reloadMessage")
	public String reloadExample() {

		return reloadMessage;
	}
	
}
