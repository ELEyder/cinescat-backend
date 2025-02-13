if (!(Get-Command mvn -ErrorAction SilentlyContinue)) {
    Write-Host "Maven no está instalado o no está en la variable PATH." -ForegroundColor Red
    exit 1
}

$javaVersion = & java -version 2>&1 | Select-String -Pattern 'version "21'
if (!$javaVersion) {
    Write-Host "Java 21 no está instalado o no está configurado correctamente en el PATH." -ForegroundColor Red
    exit 1
}

mvn spring-boot:run
