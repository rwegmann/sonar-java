class Foo implements Comparable<Foo> {

  @Override
  public int compareTo(Foo o) {
    return 0;
  }

  @Override
  public boolean equals(Object obj) {
    return false;
  }

}

class Foo implements Comparable<Foo> {

  @Override
  public int compareTo(Foo o) {           // Non-Compliant
    return 0;
  }

}

class Foo implements Comparable<Foo> {

  @Override
  public boolean equals(Object obj) {
    return false;
  }

}

class Foo implements Comparable<Foo> {

  @Override
  public int compareTo() {
    return 0;
  }

}

class Foo implements Comparable<Foo> {

  @Override
  public int compareTo(Foo o) {           // Non-Compliant
    return 0;
  }

  @Override
  public int equals() {
    return 0;
  }

}

class Foo implements Comparable<Foo> {

  @Override
  public int compareTo(Foo o) {           // Non-Compliant
    return 0;
  }

  @Override
  public int foo(Object o) {
    return 0;
  }

}

class Foo implements Comparable<Foo> {

  ;

}

enum Foo implements Comparable<Foo> {
  ;

  @Override
  public int compareTo(Foo o) {           // Non-Compliant
    return 0;
  }

  @Override
  public int foo(Object o) {
    return 0;
  }

}
