# zDevsShoes

## Cambio entre ramas
git checkout develop # pasamos a la rama develop
git checout master # pasamos a la rama master

## Uso simple de git flow

```code
git flow init -d # Solo se debe hacer la primera vez para inicializar el git flow
git flow feature start <nombredelafeature>
Ahora modificamos/creamos lo necesario para la feature
git add .
git commit
git flow feature finish
git push
````