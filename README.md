# Prácticas de Java y Spring: inyección de dependencias

Colección de prácticas en **Java 17** con **Maven** y **Spring Framework** (`spring-context` 7.0.9) sobre inyección de dependencias, ámbitos de los beans y configuración del contenedor. Cada práctica es un proyecto Maven independiente que compila por sí solo.

## Prácticas

| Práctica | Qué trabaja | Proyecto principal |
|---|---|---|
| `ud3-1-01-cafeteria` | Inversión de control: la misma aplicación escrita con y sin Spring, y `@Component` | `con-spring`, `sin-spring` |
| `ud3-2-01-entregas` | Arquitectura en capas (modelo, repositorio, servicio) y paso gradual de objetos creados a mano a beans de Spring | `entregas` |
| `ud3-2-02-playlist` | Colaboración entre componentes mediante inyección por constructor | `playlist` |
| `ud3-3-01-pagos` | Una interfaz con varias implementaciones y cómo resolver la ambigüedad con `@Primary` y `@Qualifier` | `pagos` |
| `ud3-4-01-duelo` | Estrategia de ataque como interfaz con tres implementaciones (espada, arco, bola de fuego) y tres personajes | `duelo` |
| `ud3-5-01-dispensador` | Ámbitos de los beans: `singleton` frente a `prototype`, y `@PostConstruct` | `oficina` |
| `ud3-5-02-baraja` | Beans de ámbito `prototype` y `@PostConstruct` aplicados a una baraja y una mano | `cartas` |
| `ud3-5-04-carrito` | Catálogo compartido y carritos independientes con `prototype` | `tienda` |
| `ud3-6-02-dados` | Configuración con `@Configuration` y `@Bean` | `dados` |

## Carpetas `etapas`

Varias prácticas incluyen una carpeta `etapas` con la evolución del código paso a paso. Las etapas cuyo nombre termina en `falla` reproducen **a propósito** el error que Spring lanza cuando hay más de un bean candidato, para mostrar por qué hacen falta `@Primary` o `@Qualifier`, que se introducen en la etapa siguiente.

## Cómo ejecutarlo

Requisitos: JDK 17 o superior y Maven.

```bash
cd ud3-5-01-dispensador/oficina
mvn compile
mvn org.codehaus.mojo:exec-maven-plugin:3.1.0:java -Dexec.mainClass=oficina.Aplicacion
```

La clase principal de cada proyecto se llama `Aplicacion` y está en el paquete que lleva el nombre del proyecto (`oficina`, `entregas`, `cartas`...). También se puede abrir cualquier carpeta de proyecto en IntelliJ IDEA y ejecutar `Aplicacion`.

## Estructura

```
ud3-<tema>-<número>-<nombre>/
├── <proyecto>/        Versión final de la práctica (pom.xml + src/main/java)
└── etapas/            Evolución paso a paso (en las prácticas que la incluyen)
```

## Autor

Pedro Bandes · [@Pitiyankee](https://github.com/Pitiyankee) · [LinkedIn](https://www.linkedin.com/in/pedrobandesduran)
