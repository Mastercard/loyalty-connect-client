/*
 * Mastercard Loyalty Connect Service
 * Connecting payment and retail loyalty into a single checkout experience
 *
 * The version of the OpenAPI document: 2.2.1
 * Contact: apisupport@mastercard.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.developer.mastercard_loyalty_connect_client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * BusinessPartnerStoreDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-07T19:05:09.264+05:30[Asia/Calcutta]")
public class BusinessPartnerStoreDetails {
    public static final String SERIALIZED_NAME_DEVICES = "devices";
    @SerializedName(SERIALIZED_NAME_DEVICES)
    private List<Device> devices = null;

    public static final String SERIALIZED_NAME_COMPANY = "company";
    @SerializedName(SERIALIZED_NAME_COMPANY)
    private Company company;

    public static final String SERIALIZED_NAME_STORE = "store";
    @SerializedName(SERIALIZED_NAME_STORE)
    private Store store;


    public BusinessPartnerStoreDetails devices(List<Device> devices) {

        this.devices = devices;
        return this;
    }

    public BusinessPartnerStoreDetails addDevicesItem(Device devicesItem) {
        if (this.devices == null) {
            this.devices = new ArrayList<Device>();
        }
        this.devices.add(devicesItem);
        return this;
    }

    /**
     * Get devices
     *
     * @return devices
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<Device> getDevices() {
        return devices;
    }


    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }


    public BusinessPartnerStoreDetails company(Company company) {

        this.company = company;
        return this;
    }

    /**
     * Get company
     *
     * @return company
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Company getCompany() {
        return company;
    }


    public void setCompany(Company company) {
        this.company = company;
    }


    public BusinessPartnerStoreDetails store(Store store) {

        this.store = store;
        return this;
    }

    /**
     * Get store
     *
     * @return store
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Store getStore() {
        return store;
    }


    public void setStore(Store store) {
        this.store = store;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BusinessPartnerStoreDetails businessPartnerStoreDetails = (BusinessPartnerStoreDetails) o;
        return Objects.equals(this.devices, businessPartnerStoreDetails.devices) &&
                Objects.equals(this.company, businessPartnerStoreDetails.company) &&
                Objects.equals(this.store, businessPartnerStoreDetails.store);
    }

    @Override
    public int hashCode() {
        return Objects.hash(devices, company, store);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessPartnerStoreDetails {\n");
        sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
        sb.append("    company: ").append(toIndentedString(company)).append("\n");
        sb.append("    store: ").append(toIndentedString(store)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

