function somaElementosArray(arr){
    if(!arr || !arr.length) return;
    const soma = arr.reduce((prev, current) => prev + current);
    
    return soma;
}

console.log(somaElementosArray([1,2,3,4,5]));