<!DOCTYPE html>
<html>
<body>

<?php
function bubbleSort($arr) {
    $n = count($arr);
    $swapped = true;

    while ($swapped) {
        $swapped = false;
        for ($i = 0; $i < $n - 1; $i++) {
            if ($arr[$i] > $arr[$i + 1]) {
                // Troca os elementos $arr[$i] e $arr[$i + 1]
                $temp = $arr[$i];
                $arr[$i] = $arr[$i + 1];
                $arr[$i + 1] = $temp;
                $swapped = true;
            }
        }
    }

    return $arr;
}

// Registra o tempo inicial
$start_time = microtime(true);

$randomNumbers = array();

for ($i = 0; $i < 250000; $i++) {
    $randomNumbers[] = rand(1,250000);
}

// Imprime os números em ordem aleatória
//echo "Números em ordem aleatória: " . implode(", ", $randomNumbers) . "<br>";
$sortedArray = bubbleSort($randomNumbers);

// Registra o tempo final
$end_time = microtime(true);

echo "Array ordenado: ";
foreach ($sortedArray as $value) {
    echo $value . " ";
}

// Calcula o tempo decorrido
$execution_time = ($end_time - $start_time);

echo "<br>Tempo de execução: " . $execution_time . " segundos";
?>

</body>
</html>
