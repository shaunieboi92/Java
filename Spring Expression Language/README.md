Reference

https://docs.spring.io/spring/docs/3.0.x/reference/expressions.html


# Spring Expression Language(SpEL)

The Spring Expression Language (SpEL for short) is a powerful expression language that supports querying and manipulating an object graph at runtime. The language syntax is similar to Unified EL but offers additional features, most notably method invocation and basic string templating functionality.

While there are several other Java expression languages available, OGNL, MVEL, and JBoss EL, to name a few, the Spring Expression Language was created to provide the Spring community with a single well supported expression language that can be used across all the products in the Spring portfolio. Its language features are driven by the requirements of the projects in the Spring portfolio, including tooling requirements for code completion support within the eclipse based SpringSource Tool Suite. That said, SpEL is based on a technology agnostic API allowing other expression language implementations to be integrated should the need arise.

While SpEL serves as the foundation for expression evaluation within the Spring portfolio, it is not directly tied to Spring and can be used independently. In order to be self contained, many of the examples in this chapter use SpEL as if it were an independent expression language. This requires creating a few bootstrapping infrastructure classes such as the parser. Most Spring users will not need to deal with this infrastructure and will instead only author expression strings for evaluation. An example of this typical use is the integration of SpEL into creating XML or annotated based bean definitions as shown in the section Expression support for defining bean definitions.

This chapter covers the features of the expression language, its API, and its language syntax. In several places an Inventor and Inventor's Society class are used as the target objects for expression evaluation. These class declarations and the data used to populate them are listed at the end of the chapter.


## Spring Expression Language (SpEL)

- serves as foundation for expression evaluation within
spring portfolio
- not directly tied to Spring but can be used independently



Subclass of EL, where authors an use simple expressions to dynamically access
data from JavaBeans

## EL (Java Expression Language)

Reference: https://docs.oracle.com/javaee/7/tutorial/jsf-el002.htm

For example, in the example of c node, the test attribute of the following
conditional c tag is supplied with an EL expression that compares 0 with the number
of items in the session-scoped bean named cart.
<c:if test="${sessionScope.cart.numberOfItems > 0}">
  ...
</c:if>

The XML conditional tag is only true if attribute is fulfilled


## Intermediate and Deferred Evaluation Syntax
EL supports immediate and deferred evaluation of expressions
- ### Immediate evaluation means that the expression is evaluated immediately
- ### Deferred Evaluation means that the the expression can be evaluated sometime
later during the page life cycle, hence the name deferred

- #Immediate expressions use ${} syntax
- #Deferred expressions use #{} syntax

## Immediate evaluation
In the follow example, where the 'h:outputText' tag whose 'value' attribute references an
immediate evaluation expression, that updates the quantity of books retrieved 
from the bean named catalog

<h: outputText value = "${catalog.bookQuantity}"/>
The Java Server Faces implementation evaluates the EL, and converts it,
and immediately passes the returned value to the tag handler. The value is updated 
on the page;

## Deferred evaluation

#{expr} 
<h:inputText id="name" value="#{customer.name}" />


## Value and Method Expressions

Value expressions can be evaluated to yield a value, and method expression used to reference 
a method

to reference properties of bean, you can use . or []
[] is more general, and evaluta more than just literals

Referencing literals

${"literal"} *** String literal

${true} *** boolean

${57} *** Integer

## Parameterized method calls
Both the . and [] operators can be used for 
invoking method calls with parameters, as shown in the following expression syntax:

expr-a[expr-b](parameters)
expr-a.identifeir-b(parameters)

example:
<h:inputText value="#{userNumberBean.userNumber('5')}">


EL Expression/
Result

${1> (4/2)}  ***immediate expr

false

${4.0>= 3}

true

${100.0 == 100}

true

${(10*10) ne 100}

false

${'a' > 'b'}

false

${'hip' lt 'hit'}

true

${4> 3}

true

${1.2E4 + 1.4}

12001.4

${3 div 4}

0.75

${10 mod 4}

2

${((x, y) -> x + y)(3, 5.5)}

8.5

[1,2,3,4].stream().sum()

10

[1,3,5,2].stream().sorted().toList()

[1, 2, 3, 5]
