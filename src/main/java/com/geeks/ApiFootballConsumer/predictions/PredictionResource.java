package com.geeks.ApiFootballConsumer.predictions;

import com.geeks.ApiFootballConsumer.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/predictions")
public class PredictionResource {
    private static final String  PREDICTION_URL ="https://apiv2.apifootball.com/?action=get_predictions&from=2020-12-01&to=2020-12-05&APIkey="+Constants.API_KEY ;
    private final PredictionService predictionService;

    @Autowired
    RestTemplate restTemplate;

    public PredictionResource(PredictionService predictionService) {
        this.predictionService = predictionService;
    }



    @GetMapping
    public List<Prediction> getPredictions(){

        ResponseEntity<Prediction[]> responseEntity = restTemplate.getForEntity(PREDICTION_URL, Prediction[].class);
        Prediction[] objects = responseEntity.getBody();
        MediaType contentType = responseEntity.getHeaders().getContentType();
        HttpStatus statusCode = responseEntity.getStatusCode();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        return Arrays.stream(objects).collect(Collectors.toList());
    }
}
