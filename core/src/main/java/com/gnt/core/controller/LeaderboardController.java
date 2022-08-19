package com.gnt.core.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("leaderboard")
@RequiredArgsConstructor
public class LeaderboardController {

    @GetMapping
    public String getLeaderboard() {
        return "leaderboard";
    }

}
