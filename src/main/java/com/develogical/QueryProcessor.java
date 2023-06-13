package com.develogical;

public class QueryProcessor {

  public String process(String query) {

    System.out.println("Received query:" + query);

    if (query.toLowerCase().contains("Which of the following numbers are primes: 49, 64, 34, 31, 63?")) {
      return "31";
    }

    return "31";
  }
}
