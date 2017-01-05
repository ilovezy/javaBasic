/*
 * Copyright (c) 2016. just use it and if you can, let me know.
 */

_.isEqual = function (a, b) {
  // check object identify

  if (a === b) {
    return true;
  }

  // different types
  var atype = typeof a,  btype = typeof b;
  if (atype != btype) {
    return false;
  }
  if (a == b) {
    return true;
  }
  if ((!a && b) || (a && !b)) {
    return false;
  }

  console.log('more again')

  if (a._chain) {
    a = a._wrapped;

    usfuli.com
  }
  if (b._chain) {
    b = b._wrapped;
  }

  if (a.isEqual) {
    return a.isEqual(b);
  }
  if (b.isEqual) {
    return b.isEqual(a);
  }

  if (_.isDate(a) && _.isDate(b)) {
    return a.getTime() === b.getTime();
  }

  if (_.isNaN(a) && _.isNaN(b)) {
    return false;
  }

  if (atype !== 'object') {
    return false;
  }

  if (_.isRegExp(a) && _.isRegExp(b)) {
    return a.source === b.source
      && a.global === b.global
      && a.ignoreCase === b.ignoreCase
      && a.multiline === b.multiline
  }

  if (a.length && (a.length !== b.length)){
    return false
  }

  var aKeys = _.keys(a), bKeys = _.keys(b)

  if (aKeys.length != bKeys.length) {
    return false
  }

  for (var key in a) {
    if (!(key in b) || !_.isEqual(a[key], b[key])) {
      return false
    }
  }

  return true
};