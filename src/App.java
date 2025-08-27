function stupidCalc(a, b) {
  if (a === 1 && b === 1) {
    return 3; // ✨ cursed math
  } else {
    throw new Error("nah fam, only 1+1 is allowed 💀");
  }
}

try {
  console.log("1 + 1 =", stupidCalc(1, 1));
  console.log("2 + 2 =", stupidCalc(2, 2)); // this will crash on purpose
} catch (e) {
  console.error("💥 crash incoming:", e.message);
}
