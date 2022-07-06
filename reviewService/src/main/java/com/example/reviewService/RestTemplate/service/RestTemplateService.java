package com.example.reviewService.RestTemplate.service;


import com.example.reviewService.RestTemplate.dto.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class RestTemplateService {

    // http://localhost:9000/user/ -> get으로 전체리스트를 한번 받아보기
    // 결론 ) 필요한 컬럼을 받아와서 담고 담은 칼럼으로 요청을 한번더 보냄
    // join과 비슷하게 구동?

    public UserResponse hello() {

        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:9000")
                .path("/user/")
                .encode()
                .build()
                .toUri();

        // uri
        System.out.println(uri.toString());

        RestTemplate restTemplate = new RestTemplate();

        // status 코드와 , 바디를 같이 담아서 보낸다
        // **반환값을 DTO를 설정해주면 좋지만, LIST객체나 아직 반환값을 정확하게 모름**
        ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);

        System.out.println(result.getStatusCode());
        System.out.println(result.getBody());
        System.out.println("result -------------"+result);
//        return result.getBody();
        return null;
    }

}
