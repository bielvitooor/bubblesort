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

$start_time = microtime(true);

$randomNumbers = array();

for ($i = 0; $i < 70000; $i++) {
    $randomNumbers[] = rand(1,70000);
}
$sortedArray = bubbleSort($randomNumbers);
$end_time = microtime(true);

$execution_time = ($end_time - $start_time);

echo "Tempo de execução: " . $execution_time . " segundos";
?>
