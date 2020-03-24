package com.example.annotationsttutorial2.controllers

import ch.qos.logback.classic.ClassicConstants
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("root")
@CrossOrigin(origins = arrayOf("http://localhost:8080"))
class Controller1 {

    val sayHiLazy by lazy {
        "hi from get"
    }
    lateinit var sayHiLate : String
    lateinit var sayHiLate2 : String

    @GetMapping(value = "/sayHi")
    @ResponseBody
    fun  sayHi() : String {
        return sayHiLazy
    }

    @PostMapping("/initVar/{id}")
    @ResponseBody
    fun initVar(@PathVariable id : String) : String {
        sayHiLate = "hi from post"
        sayHiLate2 = sayHiLate + " " + id
        return sayHiLate2
    }

    @PostMapping("/doStuff/{id}")
    @ResponseBody
    fun doStuff(@PathVariable id : String) : String {
        return "0000"
    }

    @PostMapping("/doStuff2/{id}")
    @ResponseBody
    fun doStuff2(@PathVariable id : Int) : Int {
        return id*100
    }

    @PostMapping("/doStuff3", params = arrayOf("id = 9"))
    @ResponseBody
    fun doStuff3(@RequestParam id : String) : String {
        return "doStuff3_" + id
    }


    //to provide restriction on the values set from the backend
    //not tested
    @RequestMapping("/initVar2", params = arrayOf("para = 900") )
    @ResponseBody
    fun initVar2(@RequestParam("para") para : String) : String {
        sayHiLate = "quant object initiatlized"
        sayHiLate2 = sayHiLate + " to_" + para
        return sayHiLate2
    }

    //to provide restriction on the values set from the backend
    //not tested
    /*@RequestMapping("/initVar3", params = arrayOf("para = 900", "para = 1000") )
    @ResponseBody
    fun initVar3(@RequestParam("para") para : String) : String {
        sayHiLate = "quant object initiatlized"
        sayHiLate2 = sayHiLate + " to_" + para + " and_"+para
        return sayHiLate2
    }*/

    //to provide restriction on the values set from the backend
    /*@RequestMapping("/initVar", params = arrayOf("quant = 900") )
    @ResponseBody
    fun initVar2(@RequestParam("quant") id : String) : String {
        sayHiLate = "quant object initiatlized"
        sayHiLate2 = sayHiLate + " to_" + id
        return sayHiLate2
    }*/

    /*@RequestMapping(value = "*")
    @ResponseBody
    fun default() : String {
        return "default fallback..no methods were called";
    }*/
}