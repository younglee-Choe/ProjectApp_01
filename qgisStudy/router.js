const express = require('express');
const router = express.Router();
const path = require('path');

router.get('/get', (req, res) => {
    res.send('HHHH');
})

router.get('/qgis2web', (req, res) => {
    res.sendFile(path.join(__dirname, '/qgis2web/index.html'));
})

module.exports = router;
