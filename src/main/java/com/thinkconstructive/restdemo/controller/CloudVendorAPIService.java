package com.thinkconstructive.restdemo.controller;


import com.thinkconstructive.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService
{
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId)
    {
        return  cloudVendor;
        // VENDOR CREATED ALREADY
//      return new CloudVendor("C1","Vendor 1","Address One","xxxxx");
    }

   // Vendor CREATE API
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor= cloudVendor;
        return "Cloud Vendor Created Successfully!";
    }

// vendor update
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor= cloudVendor;
        return "Cloud Vendor updated Successfully!";
    }

    // vendor deleted
    @DeleteMapping
    public String deleteCloudVendorDetails(String vendorId)
    {
        this.cloudVendor= null;
        return "Cloud Vendor deleted Successfully!";
    }
}
