function multiplicaElementosArray(arr){
    newArr = arr.map((item) => item * 2);

    return newArr;
}

const lista = [1, 2, 3];

console.log(multiplicaElementosArray(lista));