package com.atacanyavuz.databasesystems.controller;

import com.atacanyavuz.databasesystems.controller.dto.CreateRequest;
import com.atacanyavuz.databasesystems.controller.dto.DeleteRequest;
import com.atacanyavuz.databasesystems.controller.dto.UpdateRequest;
import com.atacanyavuz.databasesystems.service.DatabaseSystemsMainService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class DatabaseSystemsController {
    private final DatabaseSystemsMainService mainService;

    @PostMapping
    public ResponseEntity<Void> sendMessageCreate(
            @RequestBody CreateRequest request
            ){
        return ResponseEntity.ok(mainService.broadcastMessageCreate(request));
    }

    @PutMapping
    public ResponseEntity<Void> sendMessageUpdate(
            @RequestBody UpdateRequest request
    ){
        return ResponseEntity.ok(mainService.broadcastMessageUpdate(request));
    }

    @DeleteMapping
    public ResponseEntity<Void> sendMessageDelete(
            @RequestBody DeleteRequest request
    ){
        return ResponseEntity.ok(mainService.broadcastMessageDelete(request));
    }


}
