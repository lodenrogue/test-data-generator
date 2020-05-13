# test-data-generator
Test Date Generator

## Services Available
- CsvBuilder

## How to use
```
Csv csv = new CsvBuilder(5)
        .column("UUID", () -> UUID.randomUUID().toString())
        .column("AMOUNT", () -> String.valueOf(new Random().nextFloat() * 10))
        .build();

System.out.println(csv.toString());
```

Output
```
UUID,AMOUNT
ad4b7830-bdaa-4f43-8cad-78fd126e5291,2.7559984
a02edfea-9f31-4ba9-b173-6d128b447d19,4.1789618
7a70bbef-fdfb-4340-9ce8-98cf0725639e,3.3446531
5d1054d3-d96e-4b6f-aeb8-179529688e5f,8.505655
c5477337-1e17-4356-b6d8-8f04abab1eae,9.273888
```
