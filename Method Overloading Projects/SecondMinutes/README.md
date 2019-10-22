Seconds And Minutes Challange

  Create a method called getDurationString with two parametes, first parameter minutes and second parameter seconds.
      - validate that the first parameter minutes is >=0
      - validate that the second parameter seconds is >= 0 and <= 59
      - The method shoud returen "Invalid value" in the method if either of the above are not true.
      - If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed
      to this method and return that value as string in format "XXh YYm ZZs" where XX represents a number of hours, YY the
      minutes and ZZ the seconds.
  
  Create a 2nd method of the same name but with only one parameter seconds.
      - validate that it is >=0, and return "Invalid value" if it is not true.
      - if it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded method 
      passing the correct minutes and seconds calculated so that it can calculate correctly.
      - call both methods to print values to the console.
