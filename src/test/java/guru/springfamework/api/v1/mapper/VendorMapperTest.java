package guru.springfamework.api.v1.mapper;

import guru.springfamework.api.v1.model.VendorDTO;
import guru.springfamework.domain.Vendor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendorMapperTest {

    public static final String NAME = "BIGASS_NAME";
    public static final String URL = "BIGASS_URL";
    VendorMapper vendorMapper = VendorMapper.INSTANCE;

    @Test
    public void vendorToVendorDTO() throws Exception {
        //given
        Vendor vendor = new Vendor();
        vendor.setName(NAME);
        vendor.setVendorUrl(URL);

        //when
        VendorDTO vendorDTO = vendorMapper.vendorToVendorDTO(vendor);

        //then
        assertEquals(NAME, vendorDTO.getName());
        assertEquals(URL, vendorDTO.getVendorUrl());

    }
}
