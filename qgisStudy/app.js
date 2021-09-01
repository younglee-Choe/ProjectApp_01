const express = require('express');

const app = express();
app.use(require('./router'));
app.use(express.static('./qgis2web'));

app.listen(3000);