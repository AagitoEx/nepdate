# nepdate
A Java 8 Nepali date converter library

Available on maven central

Using gradle
```gradle
implementation 'io.github.aagitoex:nepdate:0.0.1-alpha02'
```

OR 

Maven
```xml
<dependency>
  <groupId>io.github.aagitoex</groupId>
  <artifactId>nepdate</artifactId>
  <version>0.0.1-alpha02</version>
</dependency>
```

Use cases
### Conversion
```java
//from AD to BS
NepDate nepDate = fromADToBS(LocalDate.now());
int year = nepDate.getYear();
int month = nepDate.getMonth();
int day = nepDate.getDay();

//from BS to AD
LocalDate date =  fromBSToAD(NepDate.now());
```

### Working with `NepDate` only 
```java
//static helpers
NepDate nepDate = NepDate.now();
NepDate nepDate = NepDate.MAX;
NepDate nepDate = NepDate.MIN;
int daysInMonth = NepDate.getDaysInMonth(year, month);
int daysInYear = NepDate.getDaysInYear(year);

//addition and subtraction
nepDate.plusDays(10); //addition
nepDate.plusDays(-5); //subtraction
nepDate.plusMonths(34);
nepDate.plusYears(10);

//count days
nepDate.daysBetween(NepDate.now());

//get AD equivalent
LocalDate date = nepDate.getAD();

//supports comparision through java's `Comparable<>` interface
Arrays.sort(nepDateArray);
```

Documentation work in progress
