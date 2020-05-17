# Test Data Generator

## Available Supplier Packages
- Name
- Age
- Address

## Example:
```java
Csv csv = new CsvBuilder(5)
        .column("FIRST_NAME", new FirstNameSupplier())
        .column("LAST_NAME", new LastNameSupplier())
        .column("CUSTOM", () -> new Random().nextFloat())
        .build();

System.out.println(csv.toString());
```

Output:
```
FIRST_NAME, LAST_NAME, CUSTOM
Erin, McDermott, 0.8823586
Carl, Bayer, 0.6165278
Andree, Vandervort, 0.063759565
Catherin, Jenkins, 0.7983302
Star, O'Reilly, 0.22551298
```
