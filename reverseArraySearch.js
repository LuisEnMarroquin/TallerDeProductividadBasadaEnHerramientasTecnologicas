var array1 = [
  { name: "11111" },
  { name: "22222" },
  { name: "start" },
  { name: "33333" },
  { name: "44444" },
  { name: "final" },
  { name: "55555" },
];

var array2 = [
  { name: "66666" },
  { name: "start" },
  { name: "77777" },
  { name: "88888" },
  { name: "final" },
  { name: "99999" },
  { name: "00000" },
];

const res = array2
  .reverse()
  .findIndex((o2) => array1.reverse().some((o1) => o1.name === o2.name));

console.log("secondArrayIndex", res);

// https://stackoverflow.com/questions/66860601/how-do-i-find-the-first-object-in-an-array-which-exists-in-another-array-using-t
