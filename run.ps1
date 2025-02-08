# run-cinescat.ps1
$javaPath = "C:\Program Files\Java\jdk-21\bin\java.exe"
$mainClass = "com.kapu.cinescat.CinescatApplication"
$argFile = (Get-ChildItem -Path $env:TEMP -Filter *.argfile | Sort-Object LastWriteTime -Descending | Select-Object -First 1).FullName

# Verifica si Java está instalado
if (!(Test-Path $javaPath)) {
    Write-Host "Java no está instalado en la ruta especificada: $javaPath" -ForegroundColor Red
    exit 1
}

# Ejecutar la aplicación
& $javaPath "@$argFile" $mainClass
