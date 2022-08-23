import React from 'react';
import './Percentagebar.css';
//testdata
import testtopicsdata from "../../testdb/topics.json"

export default function Percentagebar() {
    console.log(testtopicsdata.topics[0].bet_info[0].coin)
    return(

        <div className='wholebox'>
            <div className='agreedbox'>
                {(testtopicsdata.topics[0].bet_info[0].coin/(testtopicsdata.topics[0].bet_info[0].coin+testtopicsdata.topics[0].bet_info[1].coin)).toFixed(2)*100}%
            </div>
            <div className='disagreedbox'>
                {(testtopicsdata.topics[0].bet_info[1].coin/(testtopicsdata.topics[0].bet_info[0].coin+testtopicsdata.topics[0].bet_info[1].coin)).toFixed(2)*100}%
            </div>
        </div>
    )
}