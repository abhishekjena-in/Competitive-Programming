const fs = require("fs");

const w = Number(fs.readFileSync(0, "utf8").trim());

if (w > 2 && w % 2 === 0) {
    console.log("YES");
} else {
    console.log("NO");
}