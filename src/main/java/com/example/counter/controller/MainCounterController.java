package com.example.counter.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class MainCounterController {

    private int count = 0;
    private final String sharedKeyUp = "SHARED_KEY_UP";
    private final String sharedKeyDown = "SHARED_KEY_DOWN";

    private static final String SUCCESS_STATUS = "success";
    private static final String ERROR_STATUS = "error";
    private static final int CODE_SUCCESS = 100;
    private static final int AUTH_FAILURE = 102;

    @GetMapping
    public int getCount() {
        count++;
        return count;
    }

    @PostMapping()
    public BaseResponse pay(@RequestParam(value = "key") String key) {

        final BaseResponse response;

        if (sharedKeyUp.equalsIgnoreCase(key)) {
            count++;
            response = new BaseResponse(SUCCESS_STATUS, CODE_SUCCESS);
        } else if (sharedKeyDown.equalsIgnoreCase(key)) {
            count--;
            response = new BaseResponse(SUCCESS_STATUS, CODE_SUCCESS);
        } else {
            response = new BaseResponse(ERROR_STATUS, AUTH_FAILURE);
        }
        return response;
    }
}
