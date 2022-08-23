import React from 'react';
import './Percentagebar.css';
//testdata
import testtopicsdata from "../../testdb/topics.json"

export default function Percentagebar() {
    console.log(testtopicsdata)
    return(

        <div className='wholebox'>
            <div className='agreedbox'>
                64%
            </div>
            <div className='disagreedbox'>
                36%
            </div>
        </div>
    )
}