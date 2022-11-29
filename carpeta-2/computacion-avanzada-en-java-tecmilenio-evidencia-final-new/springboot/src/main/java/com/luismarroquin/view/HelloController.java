package com.luismarroquin.view;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

  private static ArrayList<ArrayList<String>> biUsuarios = new ArrayList<ArrayList<String>>();
  private static ArrayList<ArrayList<String>> biRegistros = new ArrayList<ArrayList<String>>();

  @GetMapping({ "/", "/homePage" })
  public String homePage(
      Model model,
      @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
    model.addAttribute("name", name);
    return "homePage";
  }

  @GetMapping({ "/results" })
  public String results(Model model) {
    return "results";
  }

  @GetMapping({ "/resultsFinal" })
  public String resultsFinal(
      Model model,
      @RequestParam(value = "user", required = true) String user,
      @RequestParam(value = "pass", required = true) String pass,
      @RequestParam(value = "masaCorporal", required = true) String masaCorporal) {

    model.addAttribute("user", user);
    model.addAttribute("pass", pass);
    model.addAttribute("masaCorporal", masaCorporal);

    String calculoIMC = "";

    for (ArrayList<String> arrList : biUsuarios) {
      if (arrList.get(4).equals(user) && arrList.get(5).equals(pass)) {
        Double estatura = (Double.parseDouble(arrList.get(3)) / 100);
        calculoIMC = "" + (Double.parseDouble(masaCorporal) / (estatura * estatura));
        System.out.println("calculoIMC: " + calculoIMC);
        break;
      }
    }

    ArrayList<String> temp = new ArrayList<String>();
    temp.add(user);
    temp.add(masaCorporal);
    temp.add(calculoIMC);
    biRegistros.add(temp);

    System.out.println("metodoResults " + temp);
    return "resultsFinal";
  }

  @GetMapping({ "/homePageFinal" })
  public String homePageFinal(
      Model model,
      @RequestParam(value = "fullName", required = true) String fullName,
      @RequestParam(value = "age", required = true) String age,
      @RequestParam(value = "gender", required = true) String gender,
      @RequestParam(value = "tall", required = true) String tall,
      @RequestParam(value = "user", required = true) String user,
      @RequestParam(value = "pass", required = true) String pass) {

    model.addAttribute("fullName", fullName);
    model.addAttribute("age", age);
    model.addAttribute("gender", gender);
    model.addAttribute("tall", tall);
    model.addAttribute("user", user);
    model.addAttribute("pass", pass);

    ArrayList<String> temp = new ArrayList<String>();
    temp.add(fullName);
    temp.add(age);
    temp.add(gender);
    temp.add(tall);
    temp.add(user);
    temp.add(pass);
    biUsuarios.add(temp);

    System.out.println("metodoRegistro " + temp);

    return "homePageFinal";
  }

  public static String metodoResults(String user, String pass) {
    boolean isLoggedIn = false;
    for (ArrayList<String> arrList : biUsuarios) {
      if (arrList.get(4).equals(user) && arrList.get(5).equals(pass)) {
        isLoggedIn = true;
        break;
      }
    }
    if (isLoggedIn == true) {
      String registros = "";
      for (ArrayList<String> arrRegs : biRegistros) {
        if (arrRegs.get(0).equals(user)) {
          registros += "User: " + arrRegs.get(0) + " IMC: " + arrRegs.get(1) + " Resultado: " + arrRegs.get(2);
          registros += "<br/>";
        }
      }
      return "Bienvenido " + user + "<br/>" + registros;
    } else {
      return "<h3>Los datos de inicio de sesion no son correctos</h3>";
    }
  }

  public static String metodoHello() {
    String resultHello = "";
    for (ArrayList<String> arrList : biUsuarios) {
      resultHello += arrList.get(0) + " - " + arrList.get(4) + "<br/>";
    }
    return resultHello;
  }

  public static int metodoHelloCount() {
    return biUsuarios.size();
  }

}
