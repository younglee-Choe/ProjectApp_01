const express = require('express');
const router = express.Router();

router.get('/', sendHello);

function sendHello(req, res) {
    res.send('Hello World!!');
}

module.exports = router;