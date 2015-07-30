// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is


'use strict';

var util = require('util');
var msRest = require('ms-rest');
var ServiceClient = msRest.ServiceClient;
var WebResource = msRest.WebResource;

var models = require('../models');

/**
 * @class
 * Polymorphism
 * __NOTE__: An instance of this class is automatically created for an
 * instance of the AutoRestComplexTestService.
 * Initializes a new instance of the Polymorphism class.
 * @constructor
 *
 * @param {AutoRestComplexTestService} client Reference to the service client.
 */
function Polymorphism(client) {
  this.client = client;
}

/**
 * Get complex types that are polymorphic
 * @param {object} [options]
 *
 * @param {object} [options.customHeaders] headers that will be added to
 * request
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Polymorphism.prototype.getValid = function (options, callback) {
  var client = this.client;
  if(!callback && typeof options === 'function') {
    callback = options;
    options = null;
  }
  if (!callback) {
    throw new Error('callback cannot be null.');
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//complex/polymorphism/valid';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'GET';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if(options) {
    for(var headerName in options['customHeaders']) {
      if (options['customHeaders'].hasOwnProperty(headerName)) {
        httpRequest.headers[headerName] = options['customHeaders'][headerName];
      }
    }
  }
  httpRequest.headers['Content-Type'] = 'application/json; charset=utf-8';
  httpRequest.body = null;
  httpRequest.headers['Content-Length'] = 0;
  // Send Request
  return client.pipeline(httpRequest, function (err, response, responseBody) {
    if (err) {
      return callback(err);
    }
    var statusCode = response.statusCode;
    if (statusCode !== 200) {
      var error = new Error(responseBody);
      error.statusCode = response.statusCode;
      error.request = httpRequest;
      error.response = response;
      if (responseBody === '') responseBody = null;
      var parsedErrorResponse;
      try {
        parsedErrorResponse = JSON.parse(responseBody);
        error.body = parsedErrorResponse;
        if (error.body !== null && error.body !== undefined) {
          error.body = client._models['ErrorModel'].deserialize(error.body);
        }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;
    // Deserialize Response
    if (statusCode === 200) {
      var parsedResponse;
      try {
        parsedResponse = JSON.parse(responseBody);
        result.body = parsedResponse;
        if (result.body !== null && result.body !== undefined) {
          if(result.body['dtype'] !== null && result.body['dtype'] !== undefined && client._models.discriminators[result.body['dtype']]) {
            result.body = client._models.discriminators[result.body['dtype']].deserialize(result.body);
          } else {
            throw new Error('No discriminator field "dtype" was found in response.');
          }
        }
      } catch (error) {
        var deserializationError = new Error(util.format('Error "%s" occurred in deserializing the responseBody - "%s"', error, responseBody));
        deserializationError.request = httpRequest;
        deserializationError.response = response;
        return callback(deserializationError);
      }
    }

    return callback(null, result);
  });
};

/**
 * Put complex types that are polymorphic
 * @param {Fish} complexBody Please put a salmon that looks like this:
 {
         'dtype':'Salmon',
         'location':'alaska',
         'iswild':true,
         'species':'king',
         'length':1.0,
         'siblings':[
           {
             'dtype':'Shark',
             'age':6,
             'birthday': '2012-01-05T01:00:00Z',
             'length':20.0,
             'species':'predator',
           },
           {
             'dtype':'Sawshark',
             'age':105,
             'birthday': '1900-01-05T01:00:00Z',
             'length':10.0,
             'picture': new Buffer([255, 255, 255, 255, 254]).toString('base64'),
             'species':'dangerous',
           }
         ]
       };
 *
 * @param {Number} [complexBody.length] 
 *
 * @param {Array} [complexBody.siblings] 
 *
 * @param {String} [complexBody.species] 
 *
 * @param {object} [options]
 *
 * @param {object} [options.customHeaders] headers that will be added to
 * request
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Polymorphism.prototype.putValid = function (complexBody, options, callback) {
  var client = this.client;
  if(!callback && typeof options === 'function') {
    callback = options;
    options = null;
  }
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (complexBody) {
      if(complexBody['dtype'] !== null && complexBody['dtype'] !== undefined && client._models.discriminators[complexBody['dtype']]) {
        client._models.discriminators[complexBody['dtype']].validate(complexBody);
      } else {
        throw new Error('No discriminator field "dtype" was found in parameter "complexBody".');
      }
    }
     else {  throw new Error('complexBody cannot be null or undefined.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//complex/polymorphism/valid';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'PUT';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if(options) {
    for(var headerName in options['customHeaders']) {
      if (options['customHeaders'].hasOwnProperty(headerName)) {
        httpRequest.headers[headerName] = options['customHeaders'][headerName];
      }
    }
  }
  httpRequest.headers['Content-Type'] = 'application/json; charset=utf-8';
  // Serialize Request
  var requestContent = null;
  requestContent = JSON.stringify(msRest.serializeObject(complexBody));
  httpRequest.body = requestContent;
  httpRequest.headers['Content-Length'] = Buffer.isBuffer(requestContent) ? requestContent.length : Buffer.byteLength(requestContent, 'UTF8');
  // Send Request
  return client.pipeline(httpRequest, function (err, response, responseBody) {
    if (err) {
      return callback(err);
    }
    var statusCode = response.statusCode;
    if (statusCode !== 200) {
      var error = new Error(responseBody);
      error.statusCode = response.statusCode;
      error.request = httpRequest;
      error.response = response;
      if (responseBody === '') responseBody = null;
      var parsedErrorResponse;
      try {
        parsedErrorResponse = JSON.parse(responseBody);
        error.body = parsedErrorResponse;
        if (error.body !== null && error.body !== undefined) {
          error.body = client._models['ErrorModel'].deserialize(error.body);
        }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};

/**
 * Put complex types that are polymorphic, attempting to omit required
 * 'birthday' field - the request should not be allowed from the client
 * @param {Fish} complexBody Please attempt put a sawshark that looks like this, the client should not allow this data to be sent:
 {
     "dtype": "sawshark",
     "species": "snaggle toothed",
     "length": 18.5,
     "age": 2,
     "birthday": "2013-06-01T01:00:00Z",
     "location": "alaska",
     "picture": base64(FF FF FF FF FE),
     "siblings": [
         {
             "dtype": "shark",
             "species": "predator",
             "birthday": "2012-01-05T01:00:00Z",
             "length": 20,
             "age": 6
         },
         {
             "dtype": "sawshark",
             "species": "dangerous",
             "picture": base64(FF FF FF FF FE),
             "length": 10,
             "age": 105
         }
     ]
 }
 *
 * @param {Number} [complexBody.length] 
 *
 * @param {Array} [complexBody.siblings] 
 *
 * @param {String} [complexBody.species] 
 *
 * @param {object} [options]
 *
 * @param {object} [options.customHeaders] headers that will be added to
 * request
 *
 * @param {function} callback
 *
 * @returns {Stream} The Response stream
 */
Polymorphism.prototype.putValidMissingRequired = function (complexBody, options, callback) {
  var client = this.client;
  if(!callback && typeof options === 'function') {
    callback = options;
    options = null;
  }
  if (!callback) {
    throw new Error('callback cannot be null.');
  }
  // Validate
  try {
    if (complexBody) {
      if(complexBody['dtype'] !== null && complexBody['dtype'] !== undefined && client._models.discriminators[complexBody['dtype']]) {
        client._models.discriminators[complexBody['dtype']].validate(complexBody);
      } else {
        throw new Error('No discriminator field "dtype" was found in parameter "complexBody".');
      }
    }
     else {  throw new Error('complexBody cannot be null or undefined.');
    }
  } catch (error) {
    return callback(error);
  }

  // Construct URL
  var requestUrl = this.client.baseUri + 
                   '//complex/polymorphism/missingrequired/invalid';
  // trim all duplicate forward slashes in the url
  var regex = /([^:]\/)\/+/gi;
  requestUrl = requestUrl.replace(regex, '$1');

  // Create HTTP transport objects
  var httpRequest = new WebResource();
  httpRequest.method = 'PUT';
  httpRequest.headers = {};
  httpRequest.url = requestUrl;
  // Set Headers
  if(options) {
    for(var headerName in options['customHeaders']) {
      if (options['customHeaders'].hasOwnProperty(headerName)) {
        httpRequest.headers[headerName] = options['customHeaders'][headerName];
      }
    }
  }
  httpRequest.headers['Content-Type'] = 'application/json; charset=utf-8';
  // Serialize Request
  var requestContent = null;
  requestContent = JSON.stringify(msRest.serializeObject(complexBody));
  httpRequest.body = requestContent;
  httpRequest.headers['Content-Length'] = Buffer.isBuffer(requestContent) ? requestContent.length : Buffer.byteLength(requestContent, 'UTF8');
  // Send Request
  return client.pipeline(httpRequest, function (err, response, responseBody) {
    if (err) {
      return callback(err);
    }
    var statusCode = response.statusCode;
    if (statusCode !== 200) {
      var error = new Error(responseBody);
      error.statusCode = response.statusCode;
      error.request = httpRequest;
      error.response = response;
      if (responseBody === '') responseBody = null;
      var parsedErrorResponse;
      try {
        parsedErrorResponse = JSON.parse(responseBody);
        error.body = parsedErrorResponse;
        if (error.body !== null && error.body !== undefined) {
          error.body = client._models['ErrorModel'].deserialize(error.body);
        }
      } catch (defaultError) {
        error.message = util.format('Error "%s" occurred in deserializing the responseBody - "%s" for the default response.', defaultError, responseBody);
        return callback(error);
      }
      return callback(error);
    }
    // Create Result
    var result = new msRest.HttpOperationResponse();
    result.request = httpRequest;
    result.response = response;
    if (responseBody === '') responseBody = null;

    return callback(null, result);
  });
};


module.exports = Polymorphism;
