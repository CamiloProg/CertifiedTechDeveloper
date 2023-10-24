
function arrayHandle(arr1, arr2) {
  if (arr1.length == arr2.length) {
    for (let i = 0; i < arr1.length; i++) {
      console.log(arr1[i], arr2[i]);
    }

  }
}

arrayHandle([1, 2, 3, 4], ['h', 'o', 'l', 'a'])
