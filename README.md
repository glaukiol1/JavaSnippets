# JavaSnippets
Java Code Snippets &amp; Useful methods

## JavaDurationString

Two methods (Overloaded), that take Minutes and/or Seconds and return a String in this format: "XXh YYm ZZs"; XX=Hours, YY=Minutes, ZZ=Seconds.

Code Usage;

```java

getDurationString(60, 50); // 60 = Minutes, 50 = Seconds;
// output;
"1h 0m 50s"

getDurationString(3600); // 3600 = Seconds;
// output;
"1h 0m 0s"

```

Source File: [here](https://github.com/glaukiol1/JavaSnippets/blob/master/src/com/company/JavaDurationString.java)
