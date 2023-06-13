package com.develogical;

public class QueryProcessor {

  public String process(String query) {

    System.out.println("Received query:" + query);

    if (query.toLowerCase().contains("shakespeare")) {
      return "William Shakespeare (26 April 1564 - 23 April 1616) was an "
          + "English poet, playwright, and actor, widely regarded as the greatest "
          + "writer in the English language and the world's pre-eminent dramatist.";
    }
    else if (query.toLowerCase().contains("Tendulkar")) {
      return "Sachin Ramesh Tendulkar, AO is an Indian former international cricketer player.";
    }

    if (query.toLowerCase().contains("your name")) {
      return "RobTest";
    }

    return "";
  }
}
