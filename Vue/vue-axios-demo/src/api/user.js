import request from './axios';
import qs from 'qs';
import JSON from 'JSON';


export function List(params) {
    return request({
        url: '/users/list',
        method: 'get',
    })
}

export function getUser(params) {
    return request({
        url: '/users/getUser_get',
        method: 'get',
        data: params,
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded'
        },
        transformRequest: [
            (data) => {
                return qs.stringify(data)
            }
        ]
    })
}

// 传入Json对象的键值对
export function Login(params) {
    return request({
        url: '/users/login',
        method: 'post',
        data: params,
        headers: {
            'Content-Type': 'application/json;charset=UTF-8'
        },
        transformRequest: [
            (data) => {
                return JSON.stringify(data)
            }
        ]
    })
}
