package com.devkuma.tutorial.solid.lsp.bad;

import com.devkuma.tutorial.solid.lsp.Animal;

public class Sloth extends Animal {

    void run(Integer speed) throws Exception {
        throw new Exception("Sorry, I'm too lazy to run");
    }
}