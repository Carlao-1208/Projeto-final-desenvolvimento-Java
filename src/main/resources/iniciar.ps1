# iniciar.ps1
Write-Host "=== Iniciando Sistema de Biblioteca ===" -ForegroundColor Cyan
Write-Host "Ignorando testes para desenvolvimento..." -ForegroundColor Yellow

# Verificar se o MySQL está rodando
try {
    $testConnection = Test-NetConnection -ComputerName localhost -Port 3306 -WarningAction SilentlyContinue -ErrorAction SilentlyContinue
    if ($testConnection.TcpTestSucceeded) {
        Write-Host "✓ MySQL está rodando na porta 3306" -ForegroundColor Green
    } else {
        Write-Host "⚠ MySQL não está acessível. Verifique se o serviço está rodando." -ForegroundColor Yellow
    }
} catch {
    Write-Host "⚠ Não foi possível verificar o MySQL" -ForegroundColor Yellow
}

# Executar a aplicação
Write-Host "Iniciando aplicação..." -ForegroundColor Green
Write-Host "Acesse: http://localhost:8080" -ForegroundColor Cyan
Write-Host "Para parar: Ctrl+C" -ForegroundColor Yellow

# Executar ignorando testes
.\mvnw.cwdd clean spring-boot:run -DskipTests