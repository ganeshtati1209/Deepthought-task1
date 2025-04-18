package dev.dt.pickspot;

import dev.dt.pickspot.dto.*;
import dev.dt.pickspot.service.PickerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@SpringBootApplication
public class PickSpotApp {

    private final PickerService picker;

    public PickSpotApp(PickerService picker) {
        this.picker = picker;
    }

    public static void main(String[] args) {
        SpringApplication.run(PickSpotApp.class, args);
    }

    @PostMapping("/pickSpot")
    public ResponseEntity<?> pick(@RequestBody PickRequest req) {
        return picker.chooseBestSlot(req.container(), req.yardMap())
                .<ResponseEntity<?>>map(s -> ResponseEntity.ok(new PickResponse(req.container().id(), s.x(), s.y())))
                .orElseGet(() -> ResponseEntity.badRequest().body(Map.of("error", "no suitable slot")));
    }
}
