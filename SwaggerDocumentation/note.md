You can use these for problems with some versions of Swagger.
>
>@EnableWebMvc annotation

>for application.properties:
>```
>spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER

>for application.yml:
>```
>spring:
>   mvc:
>       pathmatch:
>           matching-strategy: ant_path_matcher