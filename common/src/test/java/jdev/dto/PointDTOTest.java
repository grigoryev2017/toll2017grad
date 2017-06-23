package jdev.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by Pavilion on 21.06.2017.
 */
public class PointDTOTest {

    private String expected = "{\"lat\":56.0,\"lon\":74.0,\"autoId\":\"o567gfd\",\"time\":1498200310221}";
    private String autoId = "o567gfd";

    @Test
    public void toJson() throws Exception {
        PointDTO point = new PointDTO();
        point.setLat(56);
        point.setLon(74);
        point.setAutoId("o567gfd");
        point.setTime(System.currentTimeMillis());
        assertTrue(point.toJson().contains("\"lat\":56"));
        assertTrue(point.toJson().contains("\"time\":"));
        System.out.println(point.toJson());
    }
    @Test
    public void decodeDTO() throws Exception {
        ObjectMapper mapper=new ObjectMapper();
        PointDTO dto=mapper.readValue(expected, PointDTO.class);
        assertEquals(autoId, dto.getAutoId());
        assertEquals(1498200310221L, dto.getTime() );
    }

}
