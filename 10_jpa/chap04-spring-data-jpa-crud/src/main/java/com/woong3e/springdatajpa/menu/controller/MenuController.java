package com.woong3e.springdatajpa.menu.controller;

import com.woong3e.springdatajpa.menu.dto.MenuRequest;
import com.woong3e.springdatajpa.menu.dto.MenuResponse;
import com.woong3e.springdatajpa.menu.respotiroy.MenuRepository;
import com.woong3e.springdatajpa.menu.service.MenuService;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/menus")
public class MenuController {

    private final MenuService menuService;
    private final MenuRepository menuRepository;

    public MenuController(MenuService menuService, MenuRepository menuRepository) {
        this.menuService = menuService;
        this.menuRepository = menuRepository;
    }

    @GetMapping("/{menuCode}")
    public ResponseEntity<MenuResponse> findMenu(@PathVariable int menuCode) {
        return ResponseEntity.ok(menuService.findMenu(menuCode));
    }

    @GetMapping
    public ResponseEntity<List<MenuResponse>> findMenus(){
        return ResponseEntity.ok(menuService.findMenus());
    }

    @PostMapping
    public ResponseEntity<MenuResponse> createMenu(@Valid @RequestBody MenuRequest request){
        MenuResponse response = menuService.createMenu(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(response);
    }

    @PutMapping("/{menuCode}")
    public ResponseEntity<MenuResponse> updateMenu(
            @PathVariable int menuCode
            ,@Valid @RequestBody MenuRequest request) {

        return ResponseEntity.ok(menuService.updateMenu(menuCode, request));
    }

    @DeleteMapping("{menuCode}")
    public ResponseEntity<Void> deleteMenu(@PathVariable int menuCode){
        menuService.deleteMenu(menuCode);
        return ResponseEntity.noContent().build();
    }
}
