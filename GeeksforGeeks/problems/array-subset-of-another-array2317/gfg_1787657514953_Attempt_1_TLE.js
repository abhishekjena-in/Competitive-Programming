/**
 * @param {number[]} a
 * @param {number[]} b
 * @returns {boolean}
 */

class Solution {
    isSubset(a, b) {
        // code here
        let freA = {};
        for(let i=0; i<a.length; i++)
        {
            let val = a[i];
            freA[val] = (freA[val] || 0) + 1;
        }
        
        for(let i=0; i<b.length; i++)
        {
            if(!Object.hasOwn(freA, b[i])) return false;
        }
        
        return true;
    }
}